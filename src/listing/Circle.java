package listing;

public class Circle extends GeometricObject {
    private double radius;

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
}
