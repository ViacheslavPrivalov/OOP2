public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("car1"),
                new Car("car2"),
                new Truck("truck1", 6),
                new Truck("truck2", 8),
                new Bicycle("bicycle1"),
                new Bicycle("bicycle2")
        };

        ServiceStation station = new ServiceStation();
        for (Vehicle vehicle : vehicles) {
            station.check(vehicle);
        }
    }
}