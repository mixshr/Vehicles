package type.body;

import type.VehicleTypeEnum;
import type.parent.VehicleByBodyTypes;

public class PickupType extends VehicleByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PICKUP.name();
    }
}