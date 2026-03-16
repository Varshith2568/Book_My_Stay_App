/**
 * =====================================================
 * MAIN CLASS - UseCase7AddOnServiceSelection
 * =====================================================
 *
 * Demonstrates attaching optional services to a reservation.
 *
 * @version 7.0
 */

public class UseCase7AddOnServiceSelection {

    public static void main(String[] args) {

        System.out.println("Add-On Service Selection\n");

        String reservationId = "Single-1";

        AddOnService breakfast = new AddOnService("Breakfast", 500);
        AddOnService spa = new AddOnService("Spa", 1000);

        AddOnServiceManager manager = new AddOnServiceManager();

        manager.addService(reservationId, breakfast);
        manager.addService(reservationId, spa);

        double totalCost = manager.calculateTotalServiceCost(reservationId);

        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Total Add-On Cost: " + totalCost);
    }
}