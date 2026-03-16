import java.util.Scanner;

/**
 * =====================================================
 * MAIN CLASS - UseCase9ErrorHandlingValidation
 * =====================================================
 *
 * Demonstrates booking validation and error handling.
 *
 * @version 9.0
 */

public class UseCase9ErrorHandlingValidation {

    public static void main(String[] args) {

        System.out.println("Booking Validation\n");

        Scanner scanner = new Scanner(System.in);

        RoomInventory inventory = new RoomInventory();
        ReservationValidator validator = new ReservationValidator();
        BookingRequestQueue queue = new BookingRequestQueue();

        try {

            System.out.print("Enter guest name: ");
            String guestName = scanner.nextLine();

            System.out.print("Enter room type (Single Room / Double Room / Suite Room): ");
            String roomType = scanner.nextLine();

            validator.validate(guestName, roomType, inventory);

            Reservation reservation = new Reservation(guestName, roomType);

            queue.addRequest(reservation);

            System.out.println("Booking request added successfully.");

        } catch (InvalidBookingException e) {

            System.out.println("Booking failed: " + e.getMessage());

        } finally {
            scanner.close();
        }
    }
}