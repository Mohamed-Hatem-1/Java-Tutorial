package com.company;
public class Rectangle {
    private double length;
    private double width;

    // Default constructor
    // Is the first method called when creating an object
    Rectangle () {
        System.out.println("Default length is 0.0 and default width is 0.0");
        length = 0.0;
        width = 0.0;
    }

    // Parameterized constructor (Overloading)
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Setters and getters
    public void setLength(double l) {
        length = l;
    }
    public double getLength() {
        return length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public double getArea () {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    // Passing objects to methods
    public Rectangle add(Rectangle r1, Rectangle r2) {
        Rectangle result = new Rectangle();
        result.length = r1.length + r2.length;
        result.width = r1.width + r2.width;
        return result;
    }

    // Compare objects
    public boolean isEqual(Rectangle r) {
        return (this.length == r.length && this.width == r.width);
    }

    // Copy constructor
    public Rectangle(Rectangle source) {
        length = source.length;
        width = source.width;
    }

}
