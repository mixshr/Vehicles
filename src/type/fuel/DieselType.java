package type.fuel;

import type.VehicleTypeEnum;
import type.parent.VehicleByFuelTypes;

public class DieselType extends VehicleByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}