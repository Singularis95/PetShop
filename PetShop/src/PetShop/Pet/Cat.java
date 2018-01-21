package PetShop.Pet;

public class Cat extends Pet {

    public Cat() {
        breed = catBreeds[(int)(Math.random()*catBreeds.length)];
        name = petNames[(int)(Math.random()*petNames.length)];
        character = petCharacters[(int)(Math.random()*petCharacters.length)];
        cost = (int)(Math.random()*1000+100);
    }

    private String[] catBreeds = {"Siberian cat", "Cornish Rex", "Siamese cat", "Canadian Sphynx"};

}
