package edu.sdccd.cisc191.template;
import javafx.scene.control.Button;

public class BoardButton extends Button {
    private int row;
    private int col;
    private boolean hasCoins;
    private boolean isGuessed;

    public BoardButton(int row, int col, boolean hasCoins)
    {
        this.row = row;
        this.col = col;
        this.hasCoins = hasCoins;

        this.setPrefWidth(60);
        this.setPrefHeight(60);
        this.setText("?");
    }

    public void handleClick() {
        if(hasCoins) {
            this.setText("0");
        } else {
            this.setText("X");
        }
        isGuessed = true;
        setDisabled(true);
    }
}
