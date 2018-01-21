package PetShop.Services;

import PetShop.Animal;
import PetShop.PetShopStorage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class BuyAndSellService {

    public static void buy(Animal animal) {
        PetShopStorage.animals.add(animal);
        SimpleDateFormat formatDateNow = new SimpleDateFormat("yyyy.MM.dd ',' HH:mm:ss");
        Date dateNow = new Date();
        String buyOp = "Произведена покупка животного" + "\r\n" + "Парода: " + animal.getBreed() + "\r\n" + "Имя: " + animal.getName()
                + "\r\n" + "Характер: " + animal.getCharacter() + "\r\n" + "Цена: " + animal.getCost() + "\r\n" + "Дата: " + formatDateNow.format(dateNow) + "\r\n";
        System.out.println(buyOp);
        RealLifeEmulator.setOperations(buyOp);
    }

    public static void sell(Animal animal) {
        if (PetShopStorage.animals.contains(animal)) {
            PetShopStorage.animals.remove(animal);
            Date dateNow = new Date();
            SimpleDateFormat formatDateNow = new SimpleDateFormat("yyyy.MM.dd ',' HH:mm:ss");
            String sellOp = "Произведена продажа животного" + "\r\n" + "Парода: " + animal.getBreed() + "\r\n" + "Имя: " + animal.getName()
                    + "\r\n" + "Характер: " + animal.getCharacter() + "\r\n" + "Цена: " + animal.getCost() + "\r\n" + "Дата: " + formatDateNow.format(dateNow) + "\r\n";
            System.out.println(sellOp);
            RealLifeEmulator.setOperations(sellOp);
        }
        else System.out.println("Данного животного нет в наличии");
    }

}
