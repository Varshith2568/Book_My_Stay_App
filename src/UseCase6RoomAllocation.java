/**
 * =====================================================
 * MAIN CLASS - UseCase6RoomAllocation
 * =====================================================
 *
 * Demonstrates booking confirmation and room allocation.
 *
 * @version 6.0
 */

public class UseCase6RoomAllocation {

    public static void main(String[] args) {

        System.out.println("Room Allocation Processing\n");

        BookingRequestQueue queue = new BookingRequestQueue();

        queue.addRequest(new Reservation("Abhi", "Single Room"));
        queue.addRequest(new Reservation("Subha", "Single Room"));
        queue.addRequest(new Reservation("Vanmathi", "Suite Room"));

        RoomInventory inventory = new RoomInventory();

        RoomAllocationService allocationService = new RoomAllocationService();

        while (queue.hasPendingRequests()) {

            Reservation request = queue.getNextRequest();

            allocationService.allocateRoom(request, inventory);
        }
    }
}
