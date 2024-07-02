public class ConcreteVehicleFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle(String type) {
        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "truck":
                return new Truck();
            case "motorcycle":
                return new Motorcycle();
            default:
                throw new IllegalArgumentException("Unknown vehicle type");
        }
    }
}
