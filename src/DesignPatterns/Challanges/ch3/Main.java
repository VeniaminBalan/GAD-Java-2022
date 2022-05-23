package DesignPatterns.Challanges.ch3;

public class Main {
    public static void main(String[] args) {
        Apartment app01 = new Apartment("Crangasi01", 600);
        Apartment app02 = new Apartment("Crangasio2", 600);
        Apartment appo3 = new Apartment("Crangasio3", 350);
        Apartment app04 = new Apartment("Crangasio4", 400);
        Apartment app05 = new Apartment("Crangasio5", 200);

        RealEstateAgentProxy proxy = new RealEstateAgentProxy();

        proxy.represent(app01);
        proxy.represent(app02);
        proxy.represent(appo3);
        proxy.represent(app04);
        proxy.represent(app05);

        Student student01 = new Student("Ionescu", 500);
        Student student02 = new Student("Popescu", 330);

        Apartment apartmentForStudent01 = proxy.rent(student01);
        System.out.println(student01 + " rented " + apartmentForStudent01);
        Apartment apartmentForStudento2 = proxy.rent(student02);
        System.out.println(student02 + " rented " + apartmentForStudento2);

    }
}
