package org.example.factory.shape;

public class ShapeFactory {
    public Shape getShape(String Input){
        return switch (Input) {
            case "Circle" -> new Circle();
            case "Rectangle" -> new Rectangle();
            default -> null;
        };
    }

}
