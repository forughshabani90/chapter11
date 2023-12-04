package Listing3;

import listing.Circle;

public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle=new Circle(1);
        System.out.println("A circle " + circle.toString());
        System.out.println("the color is " + circle.getColor());
        System.out.println("the radius is " + circle.getRadius());
       Rectangle rectangle=new Rectangle(2,3);
        System.out.println("the area " + rectangle.getArea());
        System.out.println("the rectangle is " + rectangle.toString());
        System.out.println("the perimeter is " + rectangle.getPerimeter());

    }
}
