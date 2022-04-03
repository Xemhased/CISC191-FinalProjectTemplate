package edu.sdccd.cisc191.template;
import java.util.Scanner;

public class GameLeaderBoard{
    public static void main(String[] args) {

        System.out.println("From each attempt, keep track of the numbers of guesses left at the end of the game. ");
        System.out.println("Your score will be average according to your number of attempts. \n \nPlease enter how many " +
                "times you've played the game.");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int attempts = scanner.nextInt();
            if (attempts == 1) {
                System.out.println("Enter attempts left from game one: ");
                int attemptOne = scanner.nextInt();
                int Score = attemptOne / 1;
                FourthAttempt gameOne = new FourthAttempt(0, 0, 0, 0);
                gameOne.setAttemptOne(attemptOne);
                System.out.println("Your score is: " + Score);
                if (Score > 8){
                    System.out.println("Come on now, be honest.");
                }
                if (Score == 8){
                    System.out.println("Woah! A perfect Score, on the first try! :D");
                }
                if (Score > 3 && Score <= 7){
                    System.out.println("Nice!");
                }
                else if(Score <= 2){
                    System.out.println("I mean, I am sure you'll be fine...\n let's hope.");
                }
            }
            if (attempts == 2) {
                System.out.println("Enter attempts left from game one: ");
                int attemptOne = scanner.nextInt();
                System.out.println("Enter attempts left from game two: ");
                int attemptTwo = scanner.nextInt();
                int Score = (attemptOne + attemptTwo) / 2;
                FourthAttempt gameOne = new FourthAttempt(0, 0, 0, 0);
                gameOne.setAttemptOne(attemptOne);
                gameOne.setAttemptTwo(attemptTwo);
                System.out.println("Your score is: " + Score);
                if (Score > 8){
                    System.out.println("Come on now, be honest.");
                }
                if (Score == 8){
                    System.out.println("Woah! A perfect Score, on the first try! :D");
                }
                if (Score > 3 && Score <= 7){
                    System.out.println("Nice!");
                }
                else if(Score <= 2){
                    System.out.println("I mean, I am sure you'll be fine...\n let's hope.");
                }
            }
            if (attempts == 3) {
                System.out.println("Enter attempts left from game one: ");
                int attemptOne = scanner.nextInt();
                System.out.println("Enter attempts left from game two: ");
                int mediumScore = scanner.nextInt();
                System.out.println("Enter attempts left from game three: ");
                int lowScore = scanner.nextInt();
                int Score = (attemptOne + mediumScore + lowScore) / 3;
                FourthAttempt gameOne = new FourthAttempt(0, 0, 0, 0);
                gameOne.setAttemptOne(attemptOne);
                gameOne.setAttemptTwo(mediumScore);
                gameOne.setAttemptThree(lowScore);
                System.out.println("Your score is: " + Score);
                if (Score > 8){
                    System.out.println("Come on now, be honest.");
                }
                if (Score == 8){
                    System.out.println("Woah! A perfect Score, on the first try! :D");
                }
                if (Score > 3 && Score <= 7){
                    System.out.println("Nice!");
                }
                else if(Score <= 2){
                    System.out.println("I mean, I am sure you'll be fine...\n let's hope.");
                }
            }
            if (attempts == 4) {
                System.out.println("Enter attempts left from game one: ");
                int attemptOne = scanner.nextInt();
                System.out.println("Enter attempts left from game two: ");
                int mediumScore = scanner.nextInt();
                System.out.println("Enter attempts left from game three: ");
                int lowScore = scanner.nextInt();
                System.out.println("Enter attempts left from game four: ");
                int PlayerTriedAgain = scanner.nextInt();
                int Score = (attemptOne + mediumScore + lowScore + PlayerTriedAgain) / 4;
                FourthAttempt gameOne = new FourthAttempt(0, 0, 0, 0);
                gameOne.setAttemptOne(attemptOne);
                gameOne.setAttemptTwo(mediumScore);
                gameOne.setAttemptThree(lowScore);
                gameOne.setAttemptFour(PlayerTriedAgain);
                System.out.println("Your score is: " + Score);
                if (Score > 8){
                    System.out.println("Come on now, be honest.");
                }
                if (Score == 8){
                    System.out.println("Woah! A perfect Score, on the first try! :D");
                }
                if (Score > 3 && Score <= 7){
                    System.out.println("Nice!");
                }
                else if(Score <= 2){
                    System.out.println("I mean, I am sure you'll be fine...\n let's hope.");
                }


            } else if (attempts >= 4) {
                System.out.println("No more than 4 attempts allowed, please use the array leader board if you had 5 or more attempts.");
            }
        }
    }

}
