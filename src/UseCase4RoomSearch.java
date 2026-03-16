/**
 * =====================================================
 * MAIN CLASS - UseCase4RoomSearch
 * =====================================================
 *
 * Use Case 4: Room Search & Availability Check
 *
 * Demonstrates how guests can view available rooms
 * without modifying inventory data.
 *
 * @version 4.0
 */

public class UseCase4RoomSearch {

    public static void main(String[] args) {

        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        RoomInventory inventory = new RoomInventory();

        RoomSearchService searchService = new RoomSearchService();

        searchService.searchAvailableRooms(
                inventory,
                singleRoom,
                doubleRoom,
                suiteRoom
        );
    }
}