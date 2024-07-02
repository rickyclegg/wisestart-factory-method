import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VehicleFactoryTest {

    @Test
    public void testCreateCar() {
        VehicleFactory factory = new ConcreteVehicleFactory();
        Vehicle car = factory.createVehicle("car");
        assertEquals("Car", car.getType());
    }

    @Test
    public void testCreateTruck() {
        VehicleFactory factory = new ConcreteVehicleFactory();
        Vehicle truck = factory.createVehicle("truck");
        assertEquals("Truck", truck.getType());
    }

    @Test
    public void testCreateMotorcycle() {
        VehicleFactory factory = new ConcreteVehicleFactory();
        Vehicle motorcycle = factory.createVehicle("motorcycle");
        assertEquals("Motorcycle", motorcycle.getType());
    }

    @Test
    public void testCreateUnknownVehicle() {
        VehicleFactory factory = new ConcreteVehicleFactory();
        assertThrows(IllegalArgumentException.class, () -> {
            factory.createVehicle("plane");
        });
    }
}
