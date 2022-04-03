package edu.sdccd.cisc191.template;

public class ControllerBoard {
    protected ModelBoard modelBoard;
    private boolean gameOver;

    public ControllerBoard(){
        this.modelBoard = new ModelBoard();
    }

    public boolean youLost(){
        boolean youLost = modelBoard.getGuessesRemaining() == 0 && modelBoard.getCoinsRemaining() > 0;
        if (youLost){
            gameOver = true;
        }
        return youLost;
    }
    public boolean youWin(){
        boolean youWin = modelBoard.getCoinsRemaining() == 0;
        if(youWin) {
            gameOver = true;
        }
        return youWin;
    }
    public boolean makeGuess(int row, int col) {
        if(!gameOver) {
            return modelBoard.makeGuess(row, col);
        }
        return false;
    }

    public boolean isGameOver() {
        return gameOver;
    }
}

