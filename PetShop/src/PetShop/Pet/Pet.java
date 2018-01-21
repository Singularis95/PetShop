package PetShop.Pet;

import PetShop.AbstractAnimal;

public class Pet extends AbstractAnimal {
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

    protected String[] petNames = {"GEORGE", "RILEY", "ISAAC", "THEO"};
    protected String[] petCharacters = {"active", "passive"};
}
