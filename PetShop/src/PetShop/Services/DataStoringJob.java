package PetShop.Services;

import PetShop.Animal;
import PetShop.PetShopStorage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DataStoringJob {

    public static void writeFile() {
        File myFile = new File("Animals.txt");
        try {
            PrintWriter writer = new PrintWriter(new FileWriter(myFile, true));
            PrintWriter cleaner = new PrintWriter(new FileWriter(myFile));
            cleaner.write("");
            /*for (Animal an: PetShopStorage.animals) {
                writer.println(an.getBreed());
                writer.println(an.getName());;
                writer.println(an.getCharacter());
                writer.println(an.getCost());
                writer.println("");
            }*/
            writer.print(RealLifeEmulator.getOperations());
            writer.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
