package Practise.Scenario1;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle drawn");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
