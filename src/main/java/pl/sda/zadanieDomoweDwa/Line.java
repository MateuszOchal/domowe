package pl.sda.zadanieDomoweDwa;

import java.awt.geom.Point2D;

public class Line extends Point {
    float x1;
    float x2;
    float y1;
    float y2;
    Point point1 = new Point(3, 4);
    Point point2 = new Point(7, 1);
    public Line(float x1, float y1, float x2, float y2){
        this.x1 = point1.getX();
        this.x2 = point2.getX();
        this.y1 = point1.getY();
        this.y2 = point2.getY();

    }
    public double getDistance() {
        return Math.sqrt((Math.pow((point1.getY() - point2.getY()), 2))+ Math.pow(point2.getX() - point1.getX(),2));
    }
    @Override
    public String toString() {
        return"("+ //+ (int)x +
              //  ", " + (int)y +
                ", " + (int)x1 +
                ", " + (int)x2 +
                ", " + (int)y1 +
                ", " + (int)y2+
                ')';
}}
