import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * =====================================================
 * CLASS - CancellationService
 * =====================================================
 *
 * Handles booking cancellations and inventory rollback.
 *
 * @version 10.0
 */

public class CancellationService {

    /* Stack storing recently released reservation IDs */
    private Stack<String> releasedRoomIds;

    /* Maps reservation ID -> room type */
    private Map<String, String> reservationRoomTypeMap;

    public CancellationService() {
        releasedRoomIds = new Stack<>();
        reservationRoomTypeMap = new HashMap<>();
    }

    /* Registers a confirmed booking */
    public void registerBooking(String reservationId, String roomType) {
        reservationRoomTypeMap.put(reservationId, roomType);
    }

    /* Cancels a booking and restores inventory */
    public void cancelBooking(String reservationId, RoomInventory inventory) {

        if (!reservationRoomTypeMap.containsKey(reservationId)) {
            System.out.println("Cancellation failed: Reservation not found.");
            return;
        }

        String roomType = reservationRoomTypeMap.get(reservationId);

        releasedRoomIds.push(reservationId);

        inventory.increaseRoomCount(roomType);

        reservationRoomTypeMap.remove(reservationId);

        System.out.println("Booking cancelled successfully. Inventory restored for room type: " + roomType);
    }

    /* Displays rollback history */
    public void showRollbackHistory() {

        System.out.println("\nRollback History (Most Recent First):");

        for (String id : releasedRoomIds) {
            System.out.println("Released Reservation ID: " + id);
        }
    }
}