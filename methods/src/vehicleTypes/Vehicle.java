package vehicleTypes;

public class Vehicle {

    private int year;
    private String model;
    private String producedBy;

    public Vehicle(String model, int year, String producedBy) {
        this.year = year;
        this.model = model;
        this.producedBy = producedBy;
    }

    public void soutInfo(){
        System.out.println("This is a " + this.model + " and is year " + this.year + " made by the " + this.producedBy);
    }

}
