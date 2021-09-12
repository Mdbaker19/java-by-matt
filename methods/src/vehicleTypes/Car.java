package vehicleTypes;

public class Car extends Vehicle {

    // unique to w/e instantiated reference of this class
//    private int year;
//    private String model;

//    public Car(String modelIPick, int yearIPick) {
//        this.year = yearIPick;
//        this.model = modelIPick;
//    }

    public Car(String modelIPick, int yearIPick, String by) {
        super(modelIPick, yearIPick, by);
    }

}
