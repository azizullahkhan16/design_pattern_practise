package Practise.Scenario1;

public class Triangle extends Shape{
    private double height;
    private double base;

    public Triangle() {
        this.height = 1.0;
        this.base = 1.0;
    }

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public void draw() {
        System.out.println("Triangle drawn");
    }

    @Override
    public double getArea() {
        return 0.5 * height * base;
    }
}
