package Lab2.ch1;

public class Main {
    public static void main(String[] args)
    {
        Fighter F1 = new Fighter("Rembo", 100, 10);
        Fighter F2 = new Fighter("Jackie", 100, 10);

        BoxingMatch match = new BoxingMatch(F1, F2);
        System.out.println(match.fight());

    }

}