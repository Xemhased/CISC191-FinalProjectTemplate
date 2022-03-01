package edu.sdccd.cisc191.template;
import java.util.Arrays;
import java.util.Scanner;
public class Module1 {
    public static void main(String[] args) {

        // Scanner class object to read input
        Scanner scan = new Scanner(System.in);

        //Declares the string array with the amount of points, and levels for grading.
        int [] amountOfPoints = {1, 2, 3, 4};
        String[] gradingLevel = {"Intern", "Junior", "Senior", "Architect"};
        System.out.println(Arrays.toString(amountOfPoints));
        System.out.println("Enter the amount of points you'd like to receive: ");

        // This line of code will read the input withing the console, needs to be a number.
        int input  = scan.nextInt();

        /*if statements will act according to the value of the input, and will return a string + the object
         * at the index stated.
         */
        if (input == amountOfPoints[0]){
            System.out.println("You need to complete the " + gradingLevel[0] + " assignment.");
        }
        else if (input == amountOfPoints[1]){
            System.out.println("You need to complete the " + gradingLevel[1] + " assignment.");
        }
        else if (input == amountOfPoints[2]) {
            System.out.println("You need to complete the " + gradingLevel[2] + " assignment.");
        }
        else if (input == amountOfPoints[3]) {
            System.out.println("You need to complete the " + gradingLevel[3] + " assignment.");
        }

        //Just a little cheeky message if someone tries to be funny.
        else if (input > 4) {
            System.out.println("Yeah right, good luck with that!");
        }
        //And a good fortune message for the good vibes.
        if (input < 5){
            System.out.println("Good Luck!");
        }
    }
}