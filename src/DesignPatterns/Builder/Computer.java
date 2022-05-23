package DesignPatterns.Builder;

public class Computer {
    // only getters and no public constructor
    private String RAM; // required parameters
    private String Processor;
    private boolean bluetooth; // optional parameters

    public  String getProcessor(){return  Processor; }
    public String getRAM() { return RAM; }
    public boolean hasBluetooth() { return bluetooth; }

    public  Computer()
    {

    }
    private Computer(Builder builder) {
        this.RAM = builder.RAM;
        this.bluetooth = builder.bluetooth;
        this.Processor = builder.Processor;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "RAM='" + RAM + '\'' +
                ", Processor='" + Processor + '\'' +
                ", bluetooth=" + bluetooth +
                '}';
    }

    public static class Builder {
        private String RAM; // required parameters
        private boolean bluetooth; // optional parameters
        private String Processor;

        public Builder(String ram, String processor) {
            this.RAM = ram;
            this.Processor = processor;
        }

        public Builder setBluetooth(boolean bluetooth) {
            this.bluetooth =  bluetooth;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}