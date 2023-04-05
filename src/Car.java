public class Car extends Vehicle {
    private static final int wheelsCount = 4;

    public Car(String modelName) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
        this.checkEngine();
    }
}
