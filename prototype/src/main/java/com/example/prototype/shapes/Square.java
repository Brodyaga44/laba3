package com.example.prototype.shapes;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class Square extends Shape implements Cloneable{
    public Square(Color color) {
        super(color);
    }
    @Override
    public void draw(GraphicsContext gc,MouseEvent mouseEvent) {
        gc.setLineWidth(2.0);
        gc.setFill(color);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(6.0);
        gc.strokeRect(mouseEvent.getX() - 52/2, mouseEvent.getY()- 52/2, 52, 52);
        gc.fillRect(mouseEvent.getX() - 52/2, mouseEvent.getY()- 52/2, 52, 52);
    }
    @Override
    public String toString() {
        return "КВАДРАТ";
    }

    @Override
    public Square clone() {
        return (Square) super.clone();
    }


}
