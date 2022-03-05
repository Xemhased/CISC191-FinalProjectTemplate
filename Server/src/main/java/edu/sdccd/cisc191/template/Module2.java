package edu.sdccd.cisc191.template;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Scanner;
public class Module2 {
    public static void main(String args[]) {

        // Scanner class object to read input
        Scanner choice = new Scanner(System.in);

        //declares the 2d array from which the RGB values will be retrieved.
        int[][] value = {{255,0,0}, {0,255,0}, {0,0,255},{0,0,0} };
        String[] color = {"1: Red","2: Green","3: Blue", "4: Black"};


        //adds instructions for the console inputs.
        System.out.println("\n" + "Choose a color by inputting it's number:");
        System.out.println(Arrays.toString(color));
        System.out.println("\t" + "This will provide it's RGB value.");

        // This line of code will read the input withing the console, needs to be a number.
        int colorChoice = choice.nextInt();

        /**
         * if statements will act according to the value of the input, and will return a string + the object
         * at the index stated, or a message specific to an out of bonds input.
         */
        if(colorChoice == 1){
            System.out.println(value[0][0] + ", " + value[0][1] + ", " + value[0][2]);
        }
        else if(colorChoice == 2){
            System.out.println(value[1][0] + ", " + value[1][1] + ", " + value[1][2]);
        }
        else if(colorChoice == 3){
            System.out.println(value[2][0] + ", " + value[2][1] + ", " + value[2][2]);
        }
        else if(colorChoice == 4){
            System.out.println(value[3][0] + ", " + value[3][1] + ", " + value[3][2]);
        }
        else if(colorChoice > 4) {
            System.out.println("There is no such value in the list, try again.");
        }
    }
}
//added comment to push changes.