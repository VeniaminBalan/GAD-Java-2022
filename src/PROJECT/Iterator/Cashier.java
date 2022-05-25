package PROJECT.Iterator;

public class Cashier implements MyIterator{

    Bank bank;
    int current = -1;

    public Cashier(Bank collection){
        this.bank = collection;
    }

    @Override
    public boolean hasNext() {
        if(current < bank.Count() - 1){
            current ++;
            return true;
        }
        return false;
    }

    public void Reset(){
        current = -1;
    }

    @Override
    public Object current() {
        return bank.getBanknote(current);
    }
}
