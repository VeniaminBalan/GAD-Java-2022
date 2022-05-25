package PROJECT.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Bank implements  MyColection{

   List<Banknote> bankVoult = new ArrayList<>();

   public Banknote getBanknote(int index) {
       return bankVoult.get(index);
   }

   public void addBanknote(Banknote banknote){
       bankVoult.add(banknote);
   }

   public int Count(){
        return bankVoult.size();
    }

    @Override
    public MyIterator iterator() {
        return new Cashier(this);
    }
}
