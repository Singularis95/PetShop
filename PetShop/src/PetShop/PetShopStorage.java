package PetShop;

import PetShop.Pet.Cat;
import PetShop.Pet.Dog;
import PetShop.Predator.Shark;
import PetShop.Predator.Wolf;

import java.util.ArrayList;
import java.util.List;

public class PetShopStorage {

    private static PetShopStorage instance;
    public static List <Animal> animals = new ArrayList<>();

    private PetShopStorage() {
        animals.add(new Wolf());
        animals.add(new Shark());
        animals.add(new Dog());
        animals.add(new Cat());
    }

    public static PetShopStorage getInstance() {
        if (instance == null) {
            instance = new PetShopStorage();
        }
        return instance;
    }

}
