package PROJECT.AbstractFactory;

public class EnchantedMazeFactory implements MazeFactory{
    @Override
    public Door MakeDoor(Room room1, Room room2) {
        return new DoorNeedingSpell(room1, room2);
    }

    @Override
    public Maze MakeMaze() {
        return new Maze();
    }

    @Override
    public Room MakeRoom(int number) {
        return new EnchantedRoom(number, CastSpell());
    }

    @Override
    public Wall MakeWall() {
        return new Wall();
    }

    protected Spell CastSpell(){
        return new Spell();
    }
}
