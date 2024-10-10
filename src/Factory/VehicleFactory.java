package Factory;

public class VehicleFactory {
    public static Vehicle getVehicle(VehicleType vehicleType) {
        if (vehicleType == null) {
            return null;
        }

        return switch (vehicleType) {
            case TWO_WHEELER -> new TwoWheeler();
            case THREE_WHEELER -> new ThreeWheeler();
            case FOUR_WHEELER -> new FourWheeler();
            default -> null;
        };
    }
}
