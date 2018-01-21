package PetShop.Pet;

public class Dog extends Pet {

    public Dog() {
        breed = dogBreeds[(int)(Math.random()*dogBreeds.length)];
        name = petNames[(int)(Math.random()*petNames.length)];
        character = petCharacters[(int)(Math.random()*petCharacters.length)];
        cost = (int)(Math.random()*1000+100);
    }

    private String[] dogBreeds = {"Chow Chow", "Sharpay", "Bulldog", "Sheepdog"};

}
