package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandleing_CWH {
    public static void main(String[] args) {

        //Creating a file
        try {
            File myFile = new File("JAVA-Windows-1/src/Practice/redundant/DummyFile1.txt");
            myFile.createNewFile();

        } catch (IOException e) {
            System.out.println("Unable to create File -> " + e);
            e.printStackTrace();
            throw new RuntimeException(e);
        }

        //Writing to a file
        try {
            FileWriter fileWriter = new FileWriter("JAVA-Windows-1/src/Practice/redundant/DummyFile2.txt");
            fileWriter.write("Let's write on this file.\nSee what will be the result.");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Unable to Write on File -> " + e);
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        //Reading a File
        File myFile2 = new File("JAVA-Windows-1/src/Practice/redundant/DummyFile2.txt");
        try {
            Scanner sc = new Scanner(myFile2);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to read a file -> " + e);
            throw new RuntimeException(e);
        }
        //Deleting file
        File myFile3 = new File("JAVA-Windows-1/src/Practice/redundant/DummyFile2.txt");
        try {
            myFile3.delete();
            System.out.println("File deleted successfully");
        } catch (Error e) {
            System.out.println("unable to delete file -> " + e);
        }

    }
}
