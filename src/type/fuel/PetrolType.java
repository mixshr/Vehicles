package type.fuel;

import type.VehicleTypeEnum;
import type.parent.VehicleByFuelTypes;

public class PetrolType extends VehicleByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}