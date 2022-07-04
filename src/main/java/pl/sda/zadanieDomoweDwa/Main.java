package pl.sda.zadanieDomoweDwa;
import java.awt.geom.Point2D;
public class Main{
    public static void main(String[] args) {

    /*    for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 9; j++) {
             float X = (j);
                System.out.print(j + ", ");
            } float Y =(i);
            System.out.print(i);
            System.out.println("");*/
        Point point1 = new Point(3, 4);
        System.out.println(point1);
        Point point2 = new Point(7, 1);
        System.out.println(point2);
        Point point4 = new Point(10, 10);
        System.out.println("odleglosc miedzy pktami:"+ Math.sqrt((Math.pow((point1.getY() - point2.getY()), 2))+ Math.pow(point2.getX() - point1.getX(),2)));


        point2.setXY(3,7);
        point1.setXY(11,1);
        System.out.println("odleglosc miedzy pktami:"+ Math.sqrt((Math.pow((point1.getY() - point2.getY()), 2))+ Math.pow(point2.getX() - point1.getX(),2)));
        System.out.println();
        System.out.println("punkty to "+ point2.getXY());
        Line line = new Line(3, 7, 11, 1);
        System.out.println(line);
        System.out.println(line.getDistance());

    }
}