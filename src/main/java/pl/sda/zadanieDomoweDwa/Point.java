package pl.sda.zadanieDomoweDwa;

import java.util.Arrays;

public class Point{
    private float x;
    private float y;
    //    private int i;
//    private int j;



    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(float x, float y) {
        this.x =x;
        this.y =y;
}

    public float getX() {
        return x;
    }
    float[] XY = {getX(), getY()};
    public String getXY() {

         return Arrays.toString(XY);
    }

    public void setX(float x) {
        this.x = x;
    }
    public  void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return"("+ + (int)x +
                ", " + (int)y +
               ')';
    }
}
