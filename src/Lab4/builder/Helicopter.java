package Lab4.builder;

public class Helicopter {
    private String Id;
    private int maxHight;
    private HelicopterTypes type;
    private  String Color;
    private  int wight;
    private int maxSpeed;

    private Helicopter()
    {

    }

    public static class Builder
    {
        private String Id;
        private int maxHight;
        private HelicopterTypes type;
        private  String Color;
        private  int wight;
        private int maxSpeed;

        public Builder(String ID)
        {
            this.Id = ID;
        }

        public Helicopter build()
        {
            Helicopter instance = new Helicopter();
            instance.Id = this.Id;
            instance.type = this.type;
            instance.maxHight = this.maxHight;
            instance.Color = this.Color;
            instance.maxSpeed = this.maxSpeed;

            return instance;
        }

        public Builder setMaxHight(int maxHight) {
            this.maxHight = maxHight;
            return this;
        }

        public Builder setType(HelicopterTypes type) {
            this.type = type;
            return this;
        }

        public Builder setColor(String color) {
            Color = color;
            return this;
        }

        public Builder setWight(int wight) {
            this.wight = wight;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }
    }
}
