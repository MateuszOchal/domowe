package pl.sda.zadanieDomoweUno;

import static java.lang.Math.PI;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4, PI);
        System.out.println(circle1);
        Circle circle2 = new Circle(5.5, PI);
        System.out.println(circle2);

        Rectangle rectangle1 = new Rectangle(54, 2);
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle(12.3, 12);
        System.out.println(rectangle2);

        Square square1 = new Square(5);
        Square square2 = new Square(2.3);
        System.out.println(square1);
        System.out.println(square2);
    }
}