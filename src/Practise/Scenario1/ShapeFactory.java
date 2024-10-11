package Practise.Scenario1;

public class ShapeFactory {

    public static Shape createShape(String shapeType) {
        if(shapeType.isBlank()) return null;

        String normalizedShapeType = shapeType.trim().toLowerCase();

        return switch (normalizedShapeType) {
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            case "triangle" -> new Triangle();
            default -> null;
        };


    }
}
