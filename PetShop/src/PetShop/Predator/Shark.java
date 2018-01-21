package PetShop.Predator;

public class Shark extends Predator {

    public Shark() {
        breed = sharkBreeds[(int)(Math.random()*sharkBreeds.length)];
        name = predatorNames[(int)(Math.random()*predatorNames.length)];
        character = predatorCharacters[(int)(Math.random()*predatorCharacters.length)];
        cost = (int)(Math.random()*1000+100);
    }

    private String[] sharkBreeds = {"Dwarf Shark", "White shark", "Tiger shark", "Hammerhead shark"};

}
