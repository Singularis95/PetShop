package PetShop.Services;

import javax.swing.*;
import java.awt.*;

public class PrintingService extends JPanel {

    public static void print() {
        JFrame frame = new JFrame("Print");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        PrintJob printJob = toolkit.getPrintJob(frame, "printOperations", null);
        Graphics graphics = printJob.getGraphics();
        graphics.drawString(RealLifeEmulator.getOperations().toString(),10,50);
        printJob.end();
    }

}
