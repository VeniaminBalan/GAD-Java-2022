package DesignPatterns.Adapter;

class SocketclassAdapter extends Socket implements SocketAdapter {
    @Override public Volt get120Volt() { return getVolt(); }
    @Override public Volt get12Volt() { return cutTo12(getVolt()); }
    @Override public Volt get3Volt() { return cvtTo3(getVolt()); }

    Volt cutTo12(Volt v)
    {
        return new Volt(120);
    }

    Volt cvtTo3(Volt v)
    {
        return new Volt(3);
    }
}
