package Test.zoo;

public class Seal extends Animal implements WaterLife {

    public Seal(){
        amountOfAnimals+=1;
    }

    @Override
    public void move() {
        System.out.println("Swim like a seal");
    }

    @Override
    public void swim() {
        System.out.println("As a seal, I live in water");
    }
}
