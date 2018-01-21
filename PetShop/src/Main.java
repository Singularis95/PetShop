import PetShop.PetShopStorage;
import PetShop.Services.DataStoringJob;
import PetShop.Services.PrintingService;
import PetShop.Services.RealLifeEmulator;

public class Main {

    public static void main(String[] args) {
        PetShopStorage.getInstance();
        RealLifeEmulator.emulate();
        DataStoringJob.writeFile();
        PrintingService.print();
    }
}
