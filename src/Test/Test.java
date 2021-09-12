package Test;

import Test.zoo.Animal;

public class Test {

    /**
        Im guessing they will want to review Classes, Static methods, => Util class

        Create Classes that inherit from others, zoo example with Classes, getters / setters
        protected and private
        So we can define different animals, a base class, Animal, others will inherit from,
            a flyable interface for Birds that can fly since not all birds do..(need a bird that does not fly or a different ex)
     */

    // create static class examples
    public static void main(String[] args) {

        //Static methods from a Util class to validate data in Main
//        Scanner sc = new Scanner(System.in);
//        String input = sc.next();
//        System.out.println(Test_util.validPassword(input));

        Zoo testZoo = new Zoo(6);
        System.out.println(testZoo.getAnimalList().size());
        for(Animal animal : testZoo.getAnimalList()) {
            animal.move();
            animal.animalFunctions();
            System.out.println();
        }

        // static value of the Animal class, not specific to any animal just an overall value for the 'Animals'
        // every new animal, in the constructor for the animal, increment this static value from the super class, Animal
        int amountOfAnimalsInZoo = Animal.amountOfAnimals;
        System.out.println("amountOfAnimalsInZoo = " + amountOfAnimalsInZoo);


    }



}
