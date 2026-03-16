import java.util.ArrayList;
import java.util.List;

/**
 * =====================================================
 * CLASS - BookingHistory
 * =====================================================
 *
 * Stores confirmed reservations in chronological order.
 *
 * @version 8.0
 */

public class BookingHistory {

    private List<Reservation> confirmedReservations;

    public BookingHistory() {
        confirmedReservations = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        confirmedReservations.add(reservation);
    }

    public List<Reservation> getConfirmedReservations() {
        return confirmedReservations;
    }
}