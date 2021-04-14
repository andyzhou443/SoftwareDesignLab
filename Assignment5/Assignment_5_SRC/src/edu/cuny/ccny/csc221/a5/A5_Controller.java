package edu.cuny.ccny.csc221.a5;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.net.URL;
import java.util.ResourceBundle;

public class A5_Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private RadioButton rBtnWhite;

    @FXML
    private ToggleGroup tgColor;

    @FXML
    private RadioButton rBtnBlack;

    @FXML
    private RadioButton rBtnGreen;

    @FXML
    private RadioButton rBtnRed;

    @FXML
    private RadioButton rBtnBlue;

    @FXML
    private RadioButton rBtnSmall;

    @FXML
    private ToggleGroup tgPenSize;

    @FXML
    private RadioButton rBtnMedium;

    @FXML
    private RadioButton rBtnLarge;

    @FXML
    private Button btnUndo;

    @FXML
    private Button btnReset;

    @FXML
    private Label lblRGB;

    @FXML
    private Slider slideRed;

    @FXML
    private Slider slideGreen;

    @FXML
    private Pane panelDraw;

    private enum PenSize {

        SMALL(2),
        MEDIUM(6),
        LARGE(10);

        final int radius;

        PenSize(int radius) {
            this.radius = radius;
        }
    }

    private enum DrawColor {

        WHITE(Color.WHITE),
        BLACK(Color.BLACK),
        RED(Color.RED),
        GREEN(Color.GREEN),
        BLUE(Color.BLUE);

        final Color color;

        DrawColor(Color color) {
            this.color = color;
        }
    }

    DrawColor drawColor = DrawColor.BLACK;
    PenSize penSize = PenSize.MEDIUM;

    private final ChangeListener<Number> chListBackgroundSlider = new ChangeListener<>() {
        @Override
        public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {

            String red = (slideRed.valueProperty().intValue() < 16 ? "0" : "") + Integer.toHexString(slideRed.valueProperty().intValue()).toUpperCase();
            String green = (slideGreen.valueProperty().intValue() < 16 ? "0" : "") + Integer.toHexString(slideGreen.valueProperty().intValue()).toUpperCase();
            String blue = "FF";

            lblRGB.setText("#" + red + green + blue);

            panelDraw.setStyle("-fx-border-color: black; -fx-background-color: #" + red + green + blue);
        }
    };

    @FXML
    /**
     * Resets the components of the application
     */
    void resetButtonEventHandler(ActionEvent event) {

        panelDraw.getChildren().clear();

        slideRed.setValue(255);
        slideGreen.setValue(255);

        rBtnBlack.setSelected(true);
        rBtnSmall.setSelected(true);

        colorChangeEventHandler(null);
        penSizeChangeEventHandler(null);
    }

    @FXML
    /**
     * Called when the color radio buttons selection changes
     */
    void colorChangeEventHandler(ActionEvent event) {
        if (rBtnWhite.isSelected())
            drawColor = DrawColor.WHITE;
        else if (rBtnBlack.isSelected())
            drawColor = DrawColor.BLACK;
        else if (rBtnGreen.isSelected())
            drawColor = DrawColor.GREEN;
        else if (rBtnRed.isSelected())
            drawColor = DrawColor.RED;
        else
            drawColor = DrawColor.BLUE;
    }

    /**
     * Called when the pen radio buttons selection changes
     */
    @FXML
    void penSizeChangeEventHandler(ActionEvent event) {

        if (rBtnSmall.isSelected())
            penSize = PenSize.SMALL;
        else if (rBtnMedium.isSelected())
            penSize = PenSize.MEDIUM;
        else
            penSize = PenSize.LARGE;
    }

    /**
     * Called when the mouse is dragged across the drawing panel
     */
    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {

        // ensure that the circle's perimeter doesn't overflow the drawing panels
        if (panelDraw.getLayoutBounds().contains(event.getX() - penSize.radius, event.getY() - penSize.radius) &&
                panelDraw.getLayoutBounds().contains(event.getX() + penSize.radius, event.getY() + penSize.radius))
            panelDraw.getChildren().add(new Circle(event.getX(), event.getY(), penSize.radius, drawColor.color));
    }

    /**
     * Called when the undo button is clicked
     */
    @FXML
    void undoButtonEventHandler(ActionEvent event) {

        if (!panelDraw.getChildren().isEmpty())
            panelDraw.getChildren().remove(panelDraw.getChildren().size() - 1);
    }

    @FXML
    void initialize() {

        assert rBtnWhite != null : "fx:id=\"rBtnWhite\" was not injected: check your FXML file 'Assignment5.fxml'.";
        assert tgColor != null : "fx:id=\"tgColor\" was not injected: check your FXML file 'Assignment5.fxml'.";
        assert rBtnBlack != null : "fx:id=\"rBtnBlack\" was not injected: check your FXML file 'Assignment5.fxml'.";
        assert rBtnGreen != null : "fx:id=\"rBtnGreen\" was not injected: check your FXML file 'Assignment5.fxml'.";
        assert rBtnRed != null : "fx:id=\"rBtnRed\" was not injected: check your FXML file 'Assignment5.fxml'.";
        assert rBtnBlue != null : "fx:id=\"rBtnBlue\" was not injected: check your FXML file 'Assignment5.fxml'.";
        assert rBtnSmall != null : "fx:id=\"rBtnSmall\" was not injected: check your FXML file 'Assignment5.fxml'.";
        assert tgPenSize != null : "fx:id=\"tgPenSize\" was not injected: check your FXML file 'Assignment5.fxml'.";
        assert rBtnMedium != null : "fx:id=\"rBtnMedium\" was not injected: check your FXML file 'Assignment5.fxml'.";
        assert rBtnLarge != null : "fx:id=\"rBtnLarge\" was not injected: check your FXML file 'Assignment5.fxml'.";
        assert btnUndo != null : "fx:id=\"btnUndo\" was not injected: check your FXML file 'Assignment5.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Assignment5.fxml'.";
        assert lblRGB != null : "fx:id=\"lblRGB\" was not injected: check your FXML file 'Assignment5.fxml'.";
        assert slideRed != null : "fx:id=\"slideRed\" was not injected: check your FXML file 'Assignment5.fxml'.";
        assert slideGreen != null : "fx:id=\"slideGreen\" was not injected: check your FXML file 'Assignment5.fxml'.";
        assert panelDraw != null : "fx:id=\"panelDraw\" was not injected: check your FXML file 'Assignment5.fxml'.";

        // initial state setup
        slideRed.valueProperty().addListener(chListBackgroundSlider);
        slideGreen.valueProperty().addListener(chListBackgroundSlider);

        chListBackgroundSlider.changed(null, null, null);
    }
}
