package Practise.Scenario1;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle () {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle drawn");
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
