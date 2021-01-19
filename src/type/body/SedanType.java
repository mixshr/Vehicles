package type.body;

import type.VehicleTypeEnum;
import type.parent.VehicleByBodyTypes;

public class SedanType extends VehicleByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.SEDAN.name();
    }
}