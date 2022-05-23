package DesignPatterns.Adapter;

class SocketobjectAdapter implements SocketAdapter {
    private Socket s = new Socket();
    @Override public Volt get120Volt(){ return s.getVolt(); }
    @Override public Volt get12Volt(){ return cvtTo12(s.getVolt()); }
    @Override public Volt get3Volt() { return cvtTo3(s.getVolt()); }

    Volt cvtTo12(Volt v)
    {
        return new Volt(120);
    }

    Volt cvtTo3(Volt v)
    {
        return new Volt(3);
    }
}

