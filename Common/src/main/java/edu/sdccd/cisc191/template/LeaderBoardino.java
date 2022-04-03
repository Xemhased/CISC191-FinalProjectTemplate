package edu.sdccd.cisc191.template;

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
