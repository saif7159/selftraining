package designpatterns;

public class BuilderPattern {
    private int wheels;
    private String engine;
    private String chasis;

    private boolean isAWD;
    private boolean isDiff;

    private BuilderPattern(CarBuilder carBuilder) {
        this.wheels = carBuilder.wheels;
        this.engine = carBuilder.engine;
        this.chasis = carBuilder.chasis;
        this.isAWD = carBuilder.isAWD;
        this.isDiff = carBuilder.isDiff;
    }

    public int getWheels() {
        return wheels;
    }

    public String getEngine() {
        return engine;
    }

    public String getChasis() {
        return chasis;
    }

    public boolean isAWD() {
        return isAWD;
    }

    public boolean isDiff() {
        return isDiff;
    }

    @Override
    public String toString() {
        return "BuilderPattern [wheels=" + wheels + ", engine=" + engine + ", chasis=" + chasis + ", isAWD=" + isAWD
                + ", isDiff=" + isDiff + "]";
    }

    public static class CarBuilder {
        private int wheels;
        private String engine;
        private String chasis;

        private boolean isAWD;
        private boolean isDiff;

        public CarBuilder(int wheels, String engine, String chasis) {
            this.wheels = wheels;
            this.engine = engine;
            this.chasis = chasis;
        }

        public CarBuilder setAWD(boolean isAWD) {
            this.isAWD = isAWD;
            return this;
        }

        public CarBuilder setDiff(boolean isDiff) {
            this.isDiff = isDiff;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }

    }

}
