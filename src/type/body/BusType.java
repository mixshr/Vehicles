package type.body;

import type.VehicleTypeEnum;
import type.parent.VehicleByBodyTypes;

public class BusType extends VehicleByBodyTypes {
    @Override
    public String getTypeName() {
        return VehicleTypeEnum.BUS.name();
    }
}