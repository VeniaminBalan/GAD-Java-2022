package PROJECT.AbstractFactory;

import java.util.HashMap;
import java.util.Map;

public class Maze {
    Map<Integer, Room> rooms;

    public Maze(){
        this.rooms = new HashMap<Integer,Room>();
    }

    public void AddRoom(Room room){
        rooms.put(room.roomNummber, room);
    }

    public Room RoomNo(int number){
        return rooms.get(number);
    }
}
