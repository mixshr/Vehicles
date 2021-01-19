import type.parent.VehicleByBodyTypes;
import type.parent.VehicleByFuelTypes;
import type.parent.VehicleType;
import type.parent.VehicleTypeByPurpose;

public class AdsService {
    private VehicleAd[] adList;

    public void setList(VehicleAd[] adList) {
        this.adList = adList;
    }

    public void filterByVehicleByPurpose(VehicleTypeByPurpose vehicleType) {
        for (VehicleAd ad : adList) {
            if (ad.getVehicleTypeByPurpose().equals(vehicleType)) {
                System.out.println("Объявление №" + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + vehicleType.getTypeName() + ", аттрибут фильтра: " + vehicleType.getAttributeOfType());
            } else {
                System.out.println("Объявление №" + ad.getId() + " не прошло фильтр: тип авто - "
                        + vehicleType.getTypeName() + ", аттрибут фильтра: " + vehicleType.getAttributeOfType() +
                        "так как имеет тип авто: " + ad.getVehicleTypeByPurpose().getTypeName());
            }
        }
    }

    public void filterByVehicleTypeByBodyTypes(VehicleByBodyTypes vehicleType) {
        for (VehicleAd ad : adList) {
            if (ad.getVehicleByBodyTypes().equals(vehicleType)) {
                System.out.println("Объявление №" + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + vehicleType.getTypeName() + ", аттрибут фильтра: " + vehicleType.getAttributeOfType());
            } else {
                System.out.println("Объявление №" + ad.getId() + " не прошло фильтр: тип авто - "
                        + vehicleType.getTypeName() + ", аттрибут фльтра: " + vehicleType.getAttributeOfType() +
                        " так как имеет тип кузова: " + ad.getVehicleByBodyTypes().getTypeName());
            }
        }
    }

    public void filterByVehicleByFuelTypes(VehicleByFuelTypes vehicleType) {
        for (VehicleAd ad : adList) {
            if (ad.getVehicleByFuelTypes().equals(vehicleType)) {
                System.out.println("Объявление №" + ad.getId() + " подходит под данный фильтр с атрибутом: тип авто - "
                        + vehicleType.getTypeName() + ", аттрибут фильтра: " + vehicleType.getAttributeOfType());
            } else {
                System.out.println("Объявление №" + ad.getId() + " не прошло фильтр: тип авто - "
                        + vehicleType.getTypeName() + ", аттрибут фильтра: " + vehicleType.getAttributeOfType() +
                        " так как имеет тип топлива: " + ad.getVehicleByFuelTypes().getTypeName());
            }
        }
    }
}