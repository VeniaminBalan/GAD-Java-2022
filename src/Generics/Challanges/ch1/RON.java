package Generics.Challanges.ch1;

public class RON implements Currency{
    private float value;

    public RON(float value){
        this.value = value;
    }

    @Override
    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public float getValue() {
        return value;
    }
}

