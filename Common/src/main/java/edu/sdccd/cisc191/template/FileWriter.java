package edu.sdccd.cisc191.template;

import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;


public class FileWriter {

    public static void main(String[] args)  throws FileNotFoundException {
        writeConsoleOutputToFile();
    }
    private static void writeConsoleOutputToFile() throws FileNotFoundException {

        PrintStream printStream = new PrintStream("A file.txt");
        System.setOut(printStream);

        PrintStream consoleStream = new PrintStream(
                new FileOutputStream(FileDescriptor.out));
        System.setOut(consoleStream);


    }
}