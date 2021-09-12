import vehicleTypes.Car;
import vehicleTypes.SUV;
import vehicleTypes.Truck;
import vehicleTypes.Vehicle;

public class Factory {

    private String manufactureName;

    public static int numberOfCarsProducedEver;

    public Factory(String manufactureName) {
        this.manufactureName = manufactureName;
    }

    public Vehicle produceVehicle(boolean isCar, boolean isTruck, String model, int year){
        numberOfCarsProducedEver++;
        if(isCar) {
            return new Car(model, year, this.manufactureName);
        } else if (isTruck) {
            return new Truck(model, year, this.manufactureName);
        }
        return new SUV(model, year, this.manufactureName);
    }


}
