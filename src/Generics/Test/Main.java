package Generics.Test;

public class Main {
    public static void main(String[] args) {
        Box a = new Box();
        a.add(10);
        System.out.println(a.get());
        Bottle b = new Bottle();
        b.add("Hello");
        System.out.println(b.get());
    }
}
interface a<T>{
    public void add (T t);
}

class Box implements a<Integer> {
    int t;
    public void add (Integer t) {
        this.t = t;
    }
    public int get() {
        return t;
    }
}
class Bottle implements a<String> {
    public void add(String t) {}
    public String get() {
        return "Hai";
    }
}