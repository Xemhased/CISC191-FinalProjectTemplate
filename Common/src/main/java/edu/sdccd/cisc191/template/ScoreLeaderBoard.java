package edu.sdccd.cisc191.template;
import java.io.*;
import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

/**
 * This file reader takes the contents from the directory stated and prints them in the console, it is wrapped in to a try/catch block.
 * Pretty simple program.
 */
public class ScoreLeaderBoard {

    public static void main(String[] args) {
        String output = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:/Users/JoseI/OneDrive/Documents/GitHub/MarchArc/Common/src/main/java/resources/Scores"));
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                output += data;
            }
            scanner.close();
            System.out.println(output);
        } catch (FileNotFoundException exception) {
            System.out.println("An error occurred.");
            exception.printStackTrace();
            System.out.println(output);
        }
        return;
    }
}
