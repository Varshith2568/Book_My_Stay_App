/**
 * =====================================================
 * CLASS - AddOnService
 * =====================================================
 *
 * Represents an optional service that can be added
 * to a confirmed reservation.
 *
 * Examples:
 * - Breakfast
 * - Spa
 * - Airport Pickup
 *
 * @version 7.0
 */

public class AddOnService {

    private String serviceName;
    private double cost;

    public AddOnService(String serviceName, double cost) {
        this.serviceName = serviceName;
        this.cost = cost;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getCost() {
        return cost;
    }
}