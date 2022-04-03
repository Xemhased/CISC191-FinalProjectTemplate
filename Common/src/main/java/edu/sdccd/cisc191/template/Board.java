package edu.sdccd.cisc191.template;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Board extends Application {
    private Canvas gameCanvas;
    private ControllerBoard controller;
    private BoardLabel coinsRemaining;
    private BoardLabel guessesRemaining;
    private BoardLabel message;

    public static void main(String[] args)
    {
        launch(args);
    }

    public void updateHeader() {

        coinsRemaining.setText("Coins: " + controller.modelBoard.getCoinsRemaining());
        guessesRemaining.setText("Guesses: " + controller.modelBoard.getGuessesRemaining());

        if(controller.youLost()) {
            message.setText("Might want to try again!");
        } else if(controller.youWin()) {
            message.setText("You win!");
        } else {
            message.setText("Find the coins!");
        }
    }
    @Override
    public void start(Stage stage) throws Exception {

        controller = new ControllerBoard();
        gameCanvas = new Canvas();
        coinsRemaining = new BoardLabel();
        guessesRemaining = new BoardLabel();
        message = new BoardLabel();

        BorderPane root = new BorderPane();
        HBox labelContainer = new HBox(coinsRemaining, guessesRemaining, message);
        VBox buttonContainer = new VBox();
        buttonContainer.setSpacing(8);
        VBox mainContainer = new VBox(labelContainer);
        updateHeader();

        for (int row=0; row < ModelBoard.DIMENSION; row++) {
            HBox buttonRow = new HBox();
            buttonRow.setSpacing(100);
            for (int col=0; col < ModelBoard.DIMENSION; col++) {
                BoardButton button = new BoardButton(row, col, controller.modelBoard.coinsAt(row,col));
                int finalRow = row;
                int finalCol = col;
                button.setOnAction(e -> {
                    controller.makeGuess(finalRow, finalCol);
                    if(!controller.isGameOver()) {
                        button.handleClick();
                        updateHeader();
                    }
                });
                buttonRow.getChildren().add(button);

            }
            buttonContainer.getChildren().add(buttonRow);
        }
        mainContainer.getChildren().add(buttonContainer);

        root.setTop(mainContainer);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Coin Hunter");
        stage.show();
    }
}