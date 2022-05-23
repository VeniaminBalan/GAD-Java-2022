package DesignPatterns.Builder;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("2 GB", "Intel I5").build();

        Computer PC1 = new Computer.Builder("16 GB", "AMD Ryzen 5").setBluetooth(true).build();
        Computer PC2 = new Computer();

        System.out.println(computer);
        System.out.println(PC1);
        System.out.println(PC2);
    }
}