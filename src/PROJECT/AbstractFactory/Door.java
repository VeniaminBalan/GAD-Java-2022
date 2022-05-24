package PROJECT.AbstractFactory;

public class Door implements MapSite{
    Room room1 = null;
    Room room2 = null;
    Boolean isOpem;

    public Door(Room room1, Room room2){
        this.room1 = room1;
        this.room2 = room2;
    }

    @Override
    public void Enter() {
        System.out.println("Door");
    }

    public  Room OtherSideFrom(Room room){
        if(room == room1) return room2;
            else return room1;
    }
}
