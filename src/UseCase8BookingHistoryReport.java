/**
 * =====================================================
 * MAIN CLASS - UseCase8BookingHistoryReport
 * =====================================================
 *
 * Demonstrates booking history storage and reporting.
 *
 * @version 8.0
 */

public class UseCase8BookingHistoryReport {

    public static void main(String[] args) {

        System.out.println("Booking History and Reporting\n");

        BookingHistory history = new BookingHistory();

        history.addReservation(new Reservation("Abhi", "Single"));
        history.addReservation(new Reservation("Subha", "Double"));
        history.addReservation(new Reservation("Vanmathi", "Suite"));

        BookingReportService reportService = new BookingReportService();

        reportService.generateReport(history);
    }
}