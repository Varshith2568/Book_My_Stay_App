import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * =====================================================
 * CLASS - RoomAllocationService
 * =====================================================
 *
 * Handles booking confirmation and room allocation.
 *
 * @version 6.0
 */

public class RoomAllocationService {

    private Set<String> allocatedRoomIds;
    private Map<String, Set<String>> assignedRoomsByType;

    public RoomAllocationService() {
        allocatedRoomIds = new HashSet<>();
        assignedRoomsByType = new HashMap<>();
    }

    public void allocateRoom(Reservation reservation, RoomInventory inventory) {

        String roomType = reservation.getRoomType();

        Map<String, Integer> availability = inventory.getRoomAvailability();

        if (!availability.containsKey(roomType) || availability.get(roomType) == 0) {
            System.out.println("No available rooms for type: " + roomType);
            return;
        }

        String roomId = generateRoomId(roomType);

        allocatedRoomIds.add(roomId);

        assignedRoomsByType
                .computeIfAbsent(roomType, k -> new HashSet<>())
                .add(roomId);

        inventory.updateAvailability(roomType, availability.get(roomType) - 1);

        System.out.println(
                "Booking confirmed for Guest: "
                        + reservation.getGuestName()
                        + ", Room ID: "
                        + roomId
        );
    }

    private String generateRoomId(String roomType) {

        int count = assignedRoomsByType
                .getOrDefault(roomType, new HashSet<>())
                .size() + 1;

        return roomType + "-" + count;
    }
}