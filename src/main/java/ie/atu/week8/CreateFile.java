package ie.atu.week8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {

            File myFile = new File("MyFile.txt");
            System.out.println("My file is located at " + myFile.getAbsolutePath());
            try {
                FileWriter myWriter = new FileWriter(myFile, true);
                myWriter.write("g");
                myWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}

