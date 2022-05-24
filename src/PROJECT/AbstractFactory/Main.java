package PROJECT.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        MazeGame mazeGame = new MazeGame();
        Maze maze = mazeGame.CreateMaze(new EnchantedMazeFactory());


    }
}
