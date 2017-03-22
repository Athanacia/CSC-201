package Exercise11_1;

/**
 * Created by Sabrewulf on 3/21/2017.
 */

public class Triangle extends GeometricObjects {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(filled);
    }

    public double getSide1() {
        return this.side1;
    }

    public void setSide1(double sideSet) {
        this.side1 = sideSet;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide2(double sideSet) {
        this.side2 = sideSet;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide3(double sideSet) {
        this.side3 = sideSet;
    }

    public double getArea() {
        double area;
        area = ((this.side1 * this.side2) / 2);
        return area;
    }

    public double getPerimeter() {
        double perimeter;
        perimeter = this.side1 + this.side2 + this.side3;
        return perimeter;
    }

    public String toString() {
        return "Triangle side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}