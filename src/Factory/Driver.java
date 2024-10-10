package Factory;

public class Driver {

    public static void main(String[] args) {

        // Create a Two Wheeler and call its method
        Vehicle vehicle1 = VehicleFactory.getVehicle(VehicleType.TWO_WHEELER);
        vehicle1.printInfo();

        // Create a Three Wheeler and call its method
        Vehicle vehicle2 = VehicleFactory.getVehicle(VehicleType.THREE_WHEELER);
        vehicle2.printInfo();

        // Create a Four Wheeler and call its method
        Vehicle vehicle3 = VehicleFactory.getVehicle(VehicleType.FOUR_WHEELER);
        vehicle3.printInfo();
    }
}
