package edu.sdccd.cisc191.template;

/**
 * Little cheeky class just for proof of work under module 6 -Interfaces-.
 */

interface LeaderBoardInterface{

    String Score = "Good";
    void getGood();

}
public class LeaderBoardino implements LeaderBoardInterface {
    public static void main (String[] args){
        System.out.println(Score);

        LeaderBoardino sc = new LeaderBoardino();
        sc.getGood();
    }

    @Override
    public void getGood() {
        System.out.println("Get Good.");
    }
}
