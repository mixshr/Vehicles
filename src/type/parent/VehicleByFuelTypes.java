package type.parent;

public class VehicleByFuelTypes extends VehicleType {
    public VehicleByFuelTypes() {
        super("Vehicle type by fuel");
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        VehicleByFuelTypes that = (VehicleByFuelTypes) object;
        return attribute != null ? attribute.equals(that.attribute) : false;
    }
}