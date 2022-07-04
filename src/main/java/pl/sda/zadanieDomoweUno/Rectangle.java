package pl.sda.zadanieDomoweUno;

public class Rectangle implements Shape {
    double x;
    double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }
   public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        return x * y;
    }
//@Override


    @Override
    public double getPerimeter() {
        return ((2 * x) + (2 * y));


    }

    @Override
    public String toString() {
        return "Rectangle { \n" +
                "x = " + x + "\n" +
                "y = " + y + "\n" +
                "pole = " + Math.round(getArea() * 100.0) / 100.0 + "\n" +
                "obwod = " + Math.round(getPerimeter() * 100.0) / 100.0 + "\n" +
                "}";
    }
}
