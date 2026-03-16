import java.util.HashMap;
import java.util.Map;

/**
 * =====================================================
 * CLASS - RoomInventory
 * =====================================================
 *
 * Use Case 3: Centralized Room Inventory Management
 *
 * This class acts as the single source of truth
 * for room availability in the hotel.
 *
 * @version 3.1
 */

public class RoomInventory {

    /**
     * Stores available room count for each room type.
     * Key   -> Room type name
     * Value -> Available room count
     */
    private Map<String, Integer> roomAvailability;

    /**
     * Constructor initializes inventory.
     */
    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    /**
     * Initializes default room availability.
     */
    private void initializeInventory() {
        roomAvailability.put("Single Room", 5);
        roomAvailability.put("Double Room", 3);
        roomAvailability.put("Suite Room", 2);
    }

    /**
     * Returns current room availability.
     */
    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    /**
     * Updates availability for a specific room type.
     */
    public void updateAvailability(String roomType, int count) {
        roomAvailability.put(roomType, count);
    }
}