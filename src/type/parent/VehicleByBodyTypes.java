package type.parent;

public class VehicleByBodyTypes extends VehicleType {
    public VehicleByBodyTypes() {
        super("Vehicle type by body");
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        VehicleByBodyTypes that = (VehicleByBodyTypes) object;
        return attribute != null ? attribute.equals(that.attribute) : false;
    }
}