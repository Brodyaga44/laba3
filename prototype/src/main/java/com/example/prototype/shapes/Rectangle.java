package com.example.prototype.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Rectangle extends Shape implements Cloneable{
    public Rectangle(Color color) {
        super(color);
    }
    @Override
    public void draw(GraphicsContext gc, MouseEvent mouseEvent) {
        gc.setLineWidth(2.0);
        gc.setFill(color);
        gc.setStroke(color);
        gc.fillRect(mouseEvent.getX() - 52/2, mouseEvent.getY()- 80/2, 52, 80);
    }
    @Override
    public String toString() {
        return "ПРЯМОУГОЛЬНИК";
    }

    @Override
    public Rectangle clone() {
        return (Rectangle) super.clone();
    }


}