package PetShop.Services;

import PetShop.Animal;
import PetShop.PetShopStorage;

import java.util.ArrayList;
import java.util.List;

public class SearchService {

    public static void Search(String breed, String name, String character, Integer cost) {
        List <Animal> searchResult = new ArrayList<>();

        for (int i=0; i<PetShopStorage.animals.size(); i++) {
            if (breed != null) {
                if(PetShopStorage.animals.get(i).getBreed().equals(breed)  & !searchResult.contains(PetShopStorage.animals.get(i))) {
                    searchResult.add(PetShopStorage.animals.get(i));
                }
                for (int j=0; j<PetShopStorage.animals.size(); j++) {
                    if (!PetShopStorage.animals.get(j).getBreed().equals(breed)) {
                        searchResult.remove(PetShopStorage.animals.get(j));
                    }
                }
            }
            if (name != null) {
                if(PetShopStorage.animals.get(i).getName().equals(name) & !searchResult.contains(PetShopStorage.animals.get(i))) {
                    searchResult.add(PetShopStorage.animals.get(i));
                }
                for (int j=0; j<PetShopStorage.animals.size(); j++) {
                    if (!PetShopStorage.animals.get(j).getName().equals(name)) {
                        searchResult.remove(PetShopStorage.animals.get(j));
                    }
                }
            }
            if (character != null) {
                if(PetShopStorage.animals.get(i).getCharacter().equals(character) & !searchResult.contains(PetShopStorage.animals.get(i))) {
                    searchResult.add(PetShopStorage.animals.get(i));
                }
                for (int j=0; j<PetShopStorage.animals.size(); j++) {
                    if (!PetShopStorage.animals.get(j).getCharacter().equals(character)) {
                        searchResult.remove(PetShopStorage.animals.get(j));
                    }
                }
            }
            if (cost != null) {
                if(PetShopStorage.animals.get(i).getCost().equals(cost) & !searchResult.contains(PetShopStorage.animals.get(i))) {
                    searchResult.add(PetShopStorage.animals.get(i));
                }
                for (int j=0; j<PetShopStorage.animals.size(); j++) {
                    if (!PetShopStorage.animals.get(j).getCost().equals(cost)) {
                        searchResult.remove(PetShopStorage.animals.get(j));
                    }
                }
            }
        }

        System.out.println("Найдено " + searchResult.size() + " совпадений:");
        for (Animal an: searchResult) {
            System.out.println("Парода: " + an.getBreed() + ", " + "Имя: " + an.getName() + ", " + "Характер: " + an.getCharacter() + ", " + "Цена: " + an.getCost() + "\n");
        }
    }

}
