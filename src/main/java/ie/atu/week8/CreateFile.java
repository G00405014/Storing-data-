package ie.atu.week8;

import java.io.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

            File myFile = new File(myFile.txt);
            System.out.println("My file is located " + myFile.getAbsolutePath());
            try {
                FileWriter myWriter = new FileWriter(myFile, true);
                PrintWriter myPrinter = new PrintWriter("Names.txt");
                myPrinter.println("This is my fourth line");
                myPrinter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}

