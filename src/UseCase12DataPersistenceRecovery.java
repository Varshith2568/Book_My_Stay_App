/**
 * =====================================================
 * MAIN CLASS - UseCase12DataPersistenceRecovery
 * =====================================================
 *
 * Demonstrates persistence and system recovery.
 */

public class UseCase12DataPersistenceRecovery {

    public static void main(String[] args) {

        System.out.println("System Recovery");

        String filePath = "inventory.txt";

        RoomInventory inventory = new RoomInventory();
        FilePersistenceService persistenceService = new FilePersistenceService();

        /* Load saved inventory */
        persistenceService.loadInventory(inventory, filePath);

        System.out.println("\nCurrent Inventory:");

        inventory.getRoomAvailability().forEach(
                (roomType, count) ->
                        System.out.println(roomType + ": " + count)
        );

        /* Save inventory again */
        persistenceService.saveInventory(inventory, filePath);
    }
}