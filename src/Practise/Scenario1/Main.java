package Practise.Scenario1;

public class Main {

    public static void main(String[] args) {
        Circle circle = (Circle) ShapeFactory.createShape("circle");
        circle.setRadius(10);
        circle.draw();
        System.out.println(circle.getArea());

        Rectangle rectangle = (Rectangle) ShapeFactory.createShape("rectangle");
        rectangle.setHeight(10);
        rectangle.setWidth(10);
        rectangle.draw();
        System.out.println(rectangle.getArea());


        Triangle triangle = (Triangle) ShapeFactory.createShape("triangle");
        triangle.setHeight(10);
        triangle.setBase(10);
        triangle.draw();
        System.out.println(triangle.getArea());


    }
}
