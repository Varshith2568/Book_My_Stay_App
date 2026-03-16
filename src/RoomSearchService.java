import java.util.Map;

/**
 * =====================================================
 * CLASS - RoomSearchService
 * =====================================================
 *
 * Use Case 4: Room Search & Availability Check
 *
 * Provides search functionality for guests
 * to view available rooms.
 *
 * @version 4.0
 */

public class RoomSearchService {

    /**
     * Displays available rooms and their details.
     */
    public void searchAvailableRooms(
            RoomInventory inventory,
            Room singleRoom,
            Room doubleRoom,
            Room suiteRoom) {

        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("Room Search\n");

        // Single Room
        if (availability.get("Single Room") > 0) {
            System.out.println("Single Room:");
            singleRoom.displayRoomDetails();
            System.out.println("Available: " + availability.get("Single Room"));
            System.out.println();
        }

        // Double Room
        if (availability.get("Double Room") > 0) {
            System.out.println("Double Room:");
            doubleRoom.displayRoomDetails();
            System.out.println("Available: " + availability.get("Double Room"));
            System.out.println();
        }

        // Suite Room
        if (availability.get("Suite Room") > 0) {
            System.out.println("Suite Room:");
            suiteRoom.displayRoomDetails();
            System.out.println("Available: " + availability.get("Suite Room"));
            System.out.println();
        }
    }
}