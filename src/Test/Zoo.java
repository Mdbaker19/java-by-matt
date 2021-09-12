package Test;

import Test.zoo.*;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private final List<Animal> animalList;


    public Zoo(int animalCount) {
        this.animalList = new ArrayList<>();
        for(int i = 0; i < animalCount; i++) {
            this.animalList.add(getNewZooAnimal());
        }
    }

    private Animal getNewZooAnimal() {
        double ran = Math.random();
        if(ran < 0.33) return new Falcon();
        if(ran < 0.63) return new Seal();
        return new Lion();
    }

    public List<Animal> getAnimalList() {
        return this.animalList;
    }



}
