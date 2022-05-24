package PROJECT.AbstractFactory;

import java.util.HashMap;
import java.util.Map;

public class Room implements MapSite{
    int roomNummber = 0;
    Map<Direction, MapSite> sides;

    public Room(int roomNo)
    {
        this.roomNummber = roomNo;
        sides = new HashMap<>(4);
    }

    @Override
    public void Enter() {
        System.out.println("Room");
    }

    public MapSite GetSide(Direction direction){
        return sides.get(direction);
    }

    public void SetSides(Direction direction, MapSite mapSide){
        this.sides.put(direction,mapSide);
    }

    public void SetRoomNumber(int roomNummber){
        this.roomNummber = roomNummber;
    }

    public int getRoomNummber(){
        return roomNummber;
    }
}
