package PetShop.Predator;

import PetShop.AbstractAnimal;

public class Predator extends AbstractAnimal {

    @Override
    public String getBreed() {
        return breed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCharacter() {
        return character;
    }

    @Override
    public Integer getCost() {
        return cost;
    }

    protected String[] predatorNames = {"JACK", "HARRY", "CHARLIE", "JAMES"};
    protected String[] predatorCharacters = {"aggressive", "calm"};
}
