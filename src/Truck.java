public class Truck extends Vehicle {

    @Override
    public void setWheelsCount(int wheelsCount) {
        if (wheelsCount >= 6 && wheelsCount <= 10) {
            super.setWheelsCount(wheelsCount);
        }
    }

    @Override
    public void check() {
        super.check();
        this.checkEngine();
        this.checkTrailer();
    }
}