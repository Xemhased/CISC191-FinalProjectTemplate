package edu.sdccd.cisc191.template;
import java.util.Scanner;

/**
 * This is a replacement for the Java array for february's Architect Level. That lab was already awarded the 4 points, but I wanted
 * to keep everything under the same context.
 *
 * The way this works is by declaring a scanner and an array. The array's length is equal to the input on the scanner creating a dynamic array
 * that allows me to do what the HandCoded application of ScoreLeaderBoard does but more efficiently, it then takes the amount of inputs based
 * on the length and averages them.
 */

public class ArrayLeaderBoard {
    public static void main(String[] args) {

        System.out.println("Use this java class if you used more than four attempts," +
                " no shame in using some extra lives ;) \nFrom each attempt, keep track of the numbers of guesses left at the end of the game. ");
        System.out.println("Your score will be average according to your number of attempts.");

        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("\nPlease enter how many times you've played the game.");
            int length = s.nextInt();
            int[] myArray = new int[length];

            Scanner in = new Scanner(System.in);

            int score = 0;
            int i = 0;
            int sum = 0;

            for (i = 0; i < myArray.length; i++) {
                System.out.println("Enter attempts left from game: ");
                myArray[i] = in.nextInt();
                sum = sum + myArray[i];
            }
            score = sum / length;
            System.out.println("Your score is: " + score + " guesses left per game.");

            if (score > 8) {
                System.out.println("Come on now, be honest.");
            }
            if (score == 8) {
                System.out.println("Woah! A perfect Score! :D");
            }
            if (score >= 3 && score <= 7) {
                System.out.println("Nice!");
            } else if (score <= 2) {
                System.out.println("I mean, I am sure you'll be fine...\n let's hope.");
            }

        }
    }

}