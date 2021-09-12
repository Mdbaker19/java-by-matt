import vehicleTypes.Vehicle;

public class Main {


    public static void main(String[] args) {

        Factory toyotaFactory = new Factory("Toyota");
        Vehicle tacoma = toyotaFactory.produceVehicle(false, true, "Tacoma", 2008);
        tacoma.soutInfo();

        Vehicle corolla = toyotaFactory.produceVehicle(true, false, "Corolla", 2006);
        corolla.soutInfo();



        Factory teslaFactory = new Factory("Tesla");
        Vehicle m3 = teslaFactory.produceVehicle(true, false, "Model 3", 2020);
        m3.soutInfo();

        Vehicle cyberTruck = teslaFactory.produceVehicle(false, true, "Cyber Truck", 2021);
        cyberTruck.soutInfo();

        System.out.println("The number of cars ever produced is " + Factory.numberOfCarsProducedEver);

        String password1 = "Hello";
        String password2 = "this";

        System.out.println(ValidPassword.isValidPassword(password1));
        System.out.println(ValidPassword.isValidPassword(password2));



//        Car corolla = new Car("Corolla", 2004);
//        Car model3 = new Car("Model 3", 2020);
//
//        Truck tacoma = new Truck("Tacoma", 2007);
//
//        SUV suv = new SUV("4Runner", 2001);

    }


}
