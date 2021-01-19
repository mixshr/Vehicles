package type.fuel;

import type.VehicleTypeEnum;
import type.parent.VehicleByFuelTypes;

public class HybridType extends VehicleByFuelTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.HYBRID.name();
    }
}