package edu.sdccd.cisc191.template;

import javafx.geometry.Insets;
import javafx.scene.control.Label;

public class BoardLabel extends Label {
    public static Insets LABEL_PADDING = new Insets(10);

    public BoardLabel() {

        this.setPadding(LABEL_PADDING);
    }
}
