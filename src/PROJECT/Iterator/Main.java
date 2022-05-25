package PROJECT.Iterator;

public class Main {
    public static void main(String[] args) {

        MyColection bank = new Bank();
        MyIterator cashier = bank.iterator();

        bank.addBanknote(new Banknote("100 $"));
        bank.addBanknote(new Banknote("120 $"));

        while (cashier.hasNext()){
            Banknote banknote = (Banknote)cashier.current();
            System.out.println(banknote.Nominal);
        }

    }
}
