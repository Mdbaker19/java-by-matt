package Test.zoo;

public class Falcon extends Bird {

    public Falcon(){
        amountOfAnimals+=1;
    }

    @Override
    public void move() {
        System.out.println("Majestic like an eagle");
    }

}
