package edu.sdccd.cisc191.template;

public class FourthAttempt extends Scores {
    int attemptFour;

    public FourthAttempt(int attemptOne, int attemptTwo, int attemptThree, int attemptFour) {
        super(attemptOne, attemptTwo, attemptThree);
    }

    public int getAttemptFour() {
        return attemptFour;
    }

    public void setAttemptFour(int labPoints) {
        this.attemptFour = labPoints;
    }
}