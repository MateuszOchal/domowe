package pl.sda.zadanieDomoweUno;

public class Square implements Shape {
    private double x;


    public Square(double x) {
        this.x = x;
    }

    @Override
    public double getArea() {
        return 2 * x;
    }

    @Override
    public double getPerimeter() {
        return 4 * x;
    }

    @Override
    public String toString() {
        return "Square { \n" +
                "x = " + x + "\n" +
                "pole = " + Math.round(getArea() * 100.0) / 100.0 + "\n" +
                "obwod = " + Math.round((getPerimeter()) * 100.0) / 100.0 + "\n" +
                "}";
    }
}
