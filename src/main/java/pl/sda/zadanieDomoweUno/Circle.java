package pl.sda.zadanieDomoweUno;

import static java.lang.Math.PI;


public class Circle implements Shape {
    double piConst = PI;
    double radius;

    public Circle(double radius, double piConst) {
        this.radius = radius;
        this.piConst = piConst;
    }

    @Override
    public double getArea() {
        return (2 * PI * radius);
    }

    @Override
    public double getPerimeter() {
        return (PI * Math.pow(radius, 2));
    }


    @Override
    public String toString() {
        return "Circle { \n" +
                "piConst = " + Math.round(PI * 100.0) / 100.0 + "\n" +
                "radius = " + radius + "\n" +
                "pole = " + Math.round(getArea() * 100.0) / 100.0 + "\n" +
                "obwod = " + Math.round(getPerimeter() * 100.0) / 100.0 + "\n" +
                "}";
    }
}

