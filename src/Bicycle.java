public class Bicycle extends Vehicle {

    @Override
    public void setWheelsCount(int wheelsCount) {
        if (wheelsCount <= 2) {
            super.setWheelsCount(wheelsCount);
        }
    }
}
