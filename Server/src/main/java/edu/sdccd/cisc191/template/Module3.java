package edu.sdccd.cisc191.template;

import javafx.application.Application;
import javafx.event.ActionEvent; //button class
import javafx.event.EventHandler; //button class
import javafx.scene.Scene;
import javafx.scene.control.Button; //def. button class
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Module3 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    //declares the array from which the GUI will retrieve and print the RGB values.
    int[][] value = {{255, 0, 0}, {0, 255, 0}, {0, 0, 255}, {0, 0, 0}};

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("RGB values");

        //Declares the buttons, text, style(color) and padding.
        Button red = new Button();
        red.setTextFill(Color.WHITE);
        red.setStyle("-fx-background-color: #ff0000; ");
        red.setText("Red");
        red.setPadding(new Insets(3,3,3,3));

        red.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(value[0][0] + ", " + value[0][1] + ", " + value[0][2]);
            }
        });

        Button green = new Button();
        green.setTextFill(Color.WHITE);
        green.setStyle("-fx-background-color: #008000; ");
        green.setText("Green");
        green.setPadding(new Insets(3,3,3,3));

        //This event handler will print a value based on the selection at the GUI.
        green.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(value[1][0] + ", " + value[1][1] + ", " + value[1][2]);
            }
        });

        Button blue = new Button();
        blue.setTextFill(Color.WHITE);
        blue.setText("Blue");
        blue.setStyle("-fx-background-color: #0000FF; ");
        blue.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(value[2][0] + ", " + value[2][1] + ", " + value[2][2]);
            }
        });

        Button black = new Button();
        black.setTextFill(Color.WHITE);
        black.setStyle("-fx-background-color: #000000; ");
        black.setText("Black");
        black.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println(value[3][0] + ", " + value[3][1] + ", " + value[3][2]);
            }
        });

        //Declares HBox, as well as scene and label.
        HBox root = new HBox();
        root.getChildren().addAll(red,green,blue,black);
        primaryStage.setScene(new Scene(root, 256, 120));
        Label textLB1 = new Label("Select an option:");
        primaryStage.show();
    }
}