package Generics.Challanges.ch1;

public class exchangeDesk<R extends Currency, U extends Currency>{
    private R Rvalue;
    private U Uvalue;

    private float rate = 1;

    public exchangeDesk(R Rvalue, U Uvalue){
        this.Rvalue = Rvalue;
        this.Uvalue = Uvalue;
    }

    public void AddRate(R Rvalue, U Uvalue, float rate){
        this.rate = rate;
    }

    R change(U Uvalue){
        float value = Uvalue.getValue() * rate;
        Rvalue.setValue(value);
        return Rvalue;
    }
}
