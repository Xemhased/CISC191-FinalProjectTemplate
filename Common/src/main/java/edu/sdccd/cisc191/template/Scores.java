package edu.sdccd.cisc191.template;

public class Scores {
    private int attemptOne;
    private int attemptTwo;
    private int attemptThree;

    public Scores(int attemptOne, int attemptTwo, int attemptThree) {

        this.attemptOne = attemptOne;
        this.attemptTwo = attemptTwo;
        this.attemptThree = attemptThree;
    }

    public int setAttemptOne() {
        return attemptOne;
    }

    public void setAttemptOne(int attemptOne) {
        this.attemptOne = attemptOne;
    }

    public int getAttemptTwo() {
        return attemptTwo;
    }

    public void setAttemptTwo(int attemptTwo) {
        this.attemptTwo = attemptTwo;
    }

    public int getAttemptThree() {
        return attemptThree;
    }

    public void setAttemptThree(int attemptThree) {
        this.attemptThree = attemptThree;
    }
}