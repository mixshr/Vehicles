import type.body.BusType;
import type.body.PickupType;
import type.body.SedanType;
import type.fuel.DieselType;
import type.fuel.ElectricType;
import type.fuel.HybridType;
import type.fuel.PetrolType;
import type.purpose.CarType;
import type.purpose.PassengerType;
import type.purpose.TruckType;

public class Main {
    public static void main(String[] args) {
        AdsService adsService = new AdsService();
        VehicleAd volvoAd = new VehicleAd("Volvo", 123, new PassengerType(), new SedanType(), new PetrolType());
        VehicleAd kamazAd = new VehicleAd("Kamaz", 234, new TruckType(), new PickupType(), new DieselType());

        adsService.setList(new VehicleAd[]{volvoAd, kamazAd});
        adsService.filterByVehicleByPurpose(new PassengerType());
        adsService.filterByVehicleByPurpose(new TruckType());

        VehicleAd bmwAd = new VehicleAd("BMW", 658, new CarType(), new SedanType(), new PetrolType());
        VehicleAd mercedesAd = new VehicleAd("Mercedes", 789, new PassengerType(), new BusType(), new HybridType());
        VehicleAd teslaAd = new VehicleAd("Tesla", 963, new CarType(), new SedanType(), new ElectricType());

        adsService.setList(new VehicleAd[]{bmwAd, mercedesAd, teslaAd});
        adsService.filterByVehicleByFuelTypes(new PetrolType());
    }
}