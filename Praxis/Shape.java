import java.util.*;

public class Shape{

    float length;
    float breadth;

    public float calculateArea(){
        return length * breadth;
    }

    public static void main(String[] args){

        Shape s1 = new Shape();
        s1.length = 5F;
        s1.breadth = 3F;

        Circle earth = new Circle();
        earth.radius = 7;

        System.out.println("Area: " + s1.calculateArea());

        System.out.println("The area of the earth is " + earth.calculateArea() + "km squared");
    }
}