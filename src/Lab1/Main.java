package Lab1;

public class Main {
    public static void main(String[] args)
    {
        int y = 0;

        for (int x = 0; y < 5; ++x) {
            if (x % 2 == 0) continue;
            y += x;

        }

        System.out.println(y);
    }

    public static void helloWorld(int n)
    {
        for (int i=1; i<= n;i++) System.out.println(i+ " ");
    }
}

