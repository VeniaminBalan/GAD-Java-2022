package DesignPatterns.Adapter;

public class Socket {
    public Volt getVolt() {
        return new Volt(120);
    }
}
