/**
 * =====================================================
 * MAIN CLASS - UseCase3InventorySetup
 * =====================================================
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * Demonstrates centralized room availability using HashMap.
 *
 * @version 3.1
 */

public class UseCase3InventorySetup {

    public static void main(String[] args) {

        System.out.println("Hotel Room Inventory Status\n");

        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        RoomInventory inventory = new RoomInventory();

        System.out.println("Single Room:");
        singleRoom.displayRoomDetails();
        System.out.println("Available Rooms: "
                + inventory.getRoomAvailability().get("Single Room"));

        System.out.println("\nDouble Room:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: "
                + inventory.getRoomAvailability().get("Double Room"));

        System.out.println("\nSuite Room:");
        suiteRoom.displayRoomDetails();
        System.out.println("Available Rooms: "
                + inventory.getRoomAvailability().get("Suite Room"));
    }
}