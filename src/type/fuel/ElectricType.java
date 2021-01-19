package type.fuel;

import type.VehicleTypeEnum;
import type.parent.VehicleByFuelTypes;

public class ElectricType extends VehicleByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.ELECTRIC.name();
    }
}