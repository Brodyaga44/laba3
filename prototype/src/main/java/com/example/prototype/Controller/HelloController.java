package com.example.prototype.Controller;

import com.example.prototype.shapes.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Canvas canvas;
    @FXML
    private ListView ListView;
    @FXML
    private ColorPicker colorSelect;
    private ObservableList<Shape> content;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Circle circle = new Circle(Color.RED);
        Square square = new Square(Color.RED);
        Triangle triangle = new Triangle(Color.RED);
        Rectangle rectangle = new Rectangle(Color.RED);
        content = FXCollections.observableArrayList();
        content.add(circle);
        content.add(square);
        content.add(rectangle);
        content.add(triangle);
        ListView.setItems(content);
        ListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    @FXML
    protected void onHelloButtonClick() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.clearRect(0,0,2620,7940);
    }



    public void drawShape(MouseEvent mouseEvent) {
        int index = ListView.getSelectionModel().getSelectedIndex();

        Shape shape = (Shape) content.get(index).clone();
        shape.setColor(colorSelect.getValue());

        shape.draw(canvas.getGraphicsContext2D(),mouseEvent);
    }
}