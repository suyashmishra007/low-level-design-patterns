package org.example.factory;

import org.example.factory.shape.Shape;
import org.example.factory.shape.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        /*
            It is used when all the objects creation and its business logic we need to keep at one place.
        */
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape CircleShape = shapeFactory.getShape("Circle");
        CircleShape.draw();

        Shape RectangleShape = shapeFactory.getShape("Rectangle");
        RectangleShape.draw();
    }
}
