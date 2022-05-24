package PROJECT.AbstractFactory;

public interface MazeFactory {
    public Door MakeDoor(Room room1, Room room2);
    public Maze MakeMaze();
    public Room MakeRoom(int number);
    public Wall MakeWall();
}
