package Test.zoo;

public abstract class Animal {

    public static int amountOfAnimals;

    // unique implementations used for each animal so it is abstract (?)
    public abstract void move();

    public void animalFunctions() {
        System.out.println("Eat, sleep, drink");
    }

}
