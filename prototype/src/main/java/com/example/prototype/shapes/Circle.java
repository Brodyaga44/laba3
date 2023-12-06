package com.example.prototype.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Circle extends Shape implements Cloneable {
    public Circle(Color color) {
        super(color);
    }
    @Override
    public void draw(GraphicsContext gc, MouseEvent mouseEvent) {
        gc.setFill(color);
        gc.fillOval(mouseEvent.getX() - 100/2, mouseEvent.getY()- 100/2, 100, 100);
    }
    @Override
    public String toString() {
        return "КРУГ";
    }

    @Override
    public Circle clone() {
        return (Circle) super.clone();
    }
}