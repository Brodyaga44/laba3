package com.example.prototype.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Triangle extends Shape implements Cloneable {
    public Triangle(Color color) {
        super(color);
    }
    @Override
    public void draw(GraphicsContext gc, MouseEvent mouseEvent) {
        double sideLength = 52;
        double height = sideLength * Math.sqrt(3) / 2;
        double centerX = mouseEvent.getX() - 52/2 + sideLength / 2;
        double topY = mouseEvent.getY() - height / 2;

        double[] xPoints = {centerX, centerX - sideLength / 2, centerX + sideLength / 2};
        double[] yPoints = {topY, topY + height, topY + height};
        gc.setFill(color);
        gc.setStroke(color);
        gc.fillPolygon(xPoints, yPoints, 3);
    }
    @Override
    public String toString() {
        return "ТРЕУГОЛЬНИК";
    }

    @Override
    public Triangle clone() {
        return (Triangle) super.clone();
    }
}
