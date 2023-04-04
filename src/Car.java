public class Car extends Vehicle {
    @Override
    public void setWheelsCount(int wheelsCount) {
        if (wheelsCount == 4) {
            super.setWheelsCount(wheelsCount);
        }
    }

    @Override
    public void check() {
        super.check();
        this.checkEngine();
    }
}
