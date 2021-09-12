package Test.zoo;

public class Lion extends Animal {

    public Lion(){
        amountOfAnimals+=1;
    }

    @Override
    public void move() {
        System.out.println("Walk like a lion");
    }
}
