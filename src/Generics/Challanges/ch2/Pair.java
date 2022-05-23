package Generics.Challanges.ch2;

import java.security.PublicKey;

class Pair<T> {
    private T first;
    private T second;
    public Pair(T firstElement, T secondElement) {
        first = firstElement;
        second = secondElement;
    }
    public Object getFirst() { return first; }
    public Object getSecond() { return second; }
}
interface Shoe {

}
class Running implements Shoe {
    Pair p;
    public Running(Object F, Object S){
        p = new Pair(F,S);
    }
}
class Heels implements Shoe {}
class Boot implements Shoe {}
