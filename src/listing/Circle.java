package listing;

import java.awt.geom.Area;

public class Circle extends GeometricObject {
    private double radius;
    private int Area;
    public Circle(int radius){

    }

//public Circle(){
//    super();
//
//}
    public Circle(String color, boolean filled, double radius) {
        super(color,filled);
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getArea() {
        return Area;
    }
}
