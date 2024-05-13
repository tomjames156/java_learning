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

        System.out.println("Area: " + s1.calculateArea());
    }
}