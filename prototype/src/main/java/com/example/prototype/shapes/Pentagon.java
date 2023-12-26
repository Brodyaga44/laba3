package com.example.prototype.shapes;

import javafx.fxml.Initializable;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class Pentagon extends Shape implements Cloneable {
    public Pentagon (Color color) {
        super(color);
    }
    @Override
    public void draw(GraphicsContext gc, MouseEvent mouseEvent) {
        double sideLength = 52;
        double height = sideLength * Math.sqrt(3) / 2;
        double centerX = mouseEvent.getX() - 52/2 + sideLength / 2;
        double topY = mouseEvent.getY() - height / 2;

        double[] xPoints = {centerX, centerX - sideLength / 2, centerX + sideLength / 2,centerX + 10};
        double[] yPoints = {topY, topY + height, topY + height,centerX,centerX + 10};
        gc.setFill(color);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(6.0);
        gc.strokePolygon(xPoints, yPoints, 5);
        gc.fillPolygon(xPoints, yPoints, 5);
    }
    @Override
    public String toString() {
        return "ПЕНТАГОН";
    }

    @Override
    public Pentagon clone() {
        return (Pentagon) super.clone();
    }

}
