import java.util.HashMap;
import java.util.Map;

public class RoomInventory {

    private Map<String, Integer> roomAvailability;

    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    public void increaseRoomCount(String roomType) {
        if(roomAvailability.containsKey(roomType)) {
            int current = roomAvailability.get(roomType);
            roomAvailability.put(roomType, current + 1);
        }
    }

    private void initializeInventory() {
        roomAvailability.put("Single Room", 5);
        roomAvailability.put("Double Room", 3);
        roomAvailability.put("Suite Room", 2);
    }

    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }

    public void updateAvailability(String roomType, int count) {
        if(roomAvailability.containsKey(roomType)) {
            roomAvailability.put(roomType, count);
        }
    }
}