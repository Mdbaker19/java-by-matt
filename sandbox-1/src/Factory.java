public class Factory {

    public static int allCarsOnTheRoad;

    private String manufactureName;
    private boolean canProduceMotorcycle;

    public Factory(String manufactureName, boolean canProduceMotorcycle) {
        this.manufactureName = manufactureName;
    }

    public Vehicle produceVehicle(int yearIPick, String modelIPick, boolean isCar) {
        allCarsOnTheRoad++;
        if(isCar) {
            return new Car(yearIPick, modelIPick);
        }
        return new Truck(yearIPick, modelIPick);
    }

    public String getManufactureName() {
        return this.manufactureName;
    }

    public void setManufactureName(String newManufactureName) {
        this.manufactureName = newManufactureName;
    }


}
