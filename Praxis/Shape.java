import java.util.*;
import models.Person;

public class Shape{

    float length;
    float height;

    public float calculateArea(){
        return length * height;
    }

    public static void main(String[] args){

        Shape s1 = new Shape();
        s1.length = 5F;
        s1.height = 3F;

        Circle earth = new Circle();
        earth.radius = 7;

        Rectangle box = new Rectangle();
        box.length = 20F;
        box.height = 4F;

        box.calculateArea();

        Square stickyNote = new Square();
        stickyNote.length = 8F;
        System.out.println("Your note has a capacity of " + stickyNote.calculateArea() + " m^2");

        System.out.println("Area: " + s1.calculateArea());

        System.out.println("The area of the earth is " + earth.calculateArea() + "km squared");

        // final int B_DAY = 28;
        // B_DAY++;
        // System.out.println(B_DAY);

        Person tomi = new Person(20, "Tomi", "Lagos");
        tomi.introduce();
        Person timone = new Person(18, "Timone", "Port Harcourt");

    }
}