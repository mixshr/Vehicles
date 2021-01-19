import type.parent.VehicleByBodyTypes;
import type.parent.VehicleByFuelTypes;
import type.parent.VehicleTypeByPurpose;

public class VehicleAd {
    private int id;
    private String model;
    private VehicleTypeByPurpose vehicleTypeByPurpose;
    private VehicleByBodyTypes vehicleByBodyTypes;
    private VehicleByFuelTypes vehicleByFuelTypes;

    public VehicleAd(String model, int id, VehicleTypeByPurpose vehicleTypeByPurpose,
                     VehicleByBodyTypes vehicleByBodyTypes, VehicleByFuelTypes vehicleByFuelTypes) {
        this.id = id;
        this.model = model;
        this.vehicleTypeByPurpose = vehicleTypeByPurpose;
        this.vehicleByBodyTypes = vehicleByBodyTypes;
        this.vehicleByFuelTypes = vehicleByFuelTypes;
    }

    public VehicleAd(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public VehicleTypeByPurpose getVehicleTypeByPurpose() {
        return vehicleTypeByPurpose;
    }

    public VehicleByBodyTypes getVehicleByBodyTypes() {
        return vehicleByBodyTypes;
    }

    public VehicleByFuelTypes getVehicleByFuelTypes() {
        return vehicleByFuelTypes;
    }

    @Override
    public String toString() {
        return this.model;
    }
}