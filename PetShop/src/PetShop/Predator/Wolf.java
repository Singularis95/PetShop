package PetShop.Predator;

public class Wolf extends Predator {

    public Wolf() {
        breed = wolfBreeds[(int)(Math.random()*wolfBreeds.length)];
        name = predatorNames[(int)(Math.random()*predatorNames.length)];
        character = predatorCharacters[(int)(Math.random()*predatorCharacters.length)];
        cost = (int)(Math.random()*1000+100);
    }

    private String[] wolfBreeds = {"Arctic Wolf", "Eastern Wolf", "Italian Wolf", "Red Wolf"};

}
