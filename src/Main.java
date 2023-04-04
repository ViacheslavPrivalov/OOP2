public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car(),
                new Car(),
                new Truck(),
                new Truck(),
                new Bicycle(),
                new Bicycle()
        };

        vehicles[0].setModelName("car1");
        vehicles[1].setModelName("car2");
        vehicles[0].setWheelsCount(4);
        vehicles[1].setWheelsCount(4);

        vehicles[2].setModelName("truck1");
        vehicles[3].setModelName("truck2");
        vehicles[2].setWheelsCount(6);
        vehicles[3].setWheelsCount(8);

        vehicles[4].setModelName("bicycle1");
        vehicles[5].setModelName("bicycle2");
        vehicles[4].setWheelsCount(2);
        vehicles[5].setWheelsCount(2);

        ServiceStation station = new ServiceStation();
        for (Vehicle vehicle : vehicles) {
            station.check(vehicle);
        }
    }
}