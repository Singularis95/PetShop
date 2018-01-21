package PetShop.Services;

import PetShop.PetShopStorage;
import PetShop.Predator.Wolf;

import java.util.Random;

public class RealLifeEmulator {

    private static StringBuffer operations = new StringBuffer();


    public static void emulate() {
        for (int i = 0; i<=10; i++) {
            int code = new Random().nextInt(3);
            Wolf wolf = new Wolf();
            switch (code) {
                case 0: BuyAndSellService.buy(wolf); break;
                case 1: BuyAndSellService.sell(wolf); break;
                case 2: escape(); break;
                default: break;
            }
        }
    }

    private static void escape() {
        if (!PetShopStorage.animals.isEmpty()) {
            int index = new Random().nextInt(PetShopStorage.animals.size());
            String escapeOp = ("Совершен побег" + "\r\n" + "Парода: " + PetShopStorage.animals.get(index).getBreed() + "\r\n" + "Имя: " + PetShopStorage.animals.get(index).getName()
                    + "\r\n" + "Характер: " + PetShopStorage.animals.get(index).getCharacter() + "\r\n" + "Цена: " + PetShopStorage.animals.get(index).getCost() + "\r\n");
            PetShopStorage.animals.remove(index);
            System.out.println(escapeOp);
            operations.append(escapeOp + "\r\n");
        }
    }

    public static StringBuffer getOperations() {
        return operations;
    }

    public static void setOperations(String string) {
        operations.append(string + "\r\n");
    }
}
