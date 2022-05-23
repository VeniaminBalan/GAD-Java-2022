package Generics.Challanges.ch1;

public class USD implements Currency{
    private float value;

    public USD(float value){
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
