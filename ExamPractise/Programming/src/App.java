import shapes.*;
import abstraction.*;

public class App {
    public static void main(String[] args){

        // Person mumsie = new Person();
        // mumsie.name = "Mummy";
        // mumsie.address = "Egbeda, Lagos";
        // mumsie.setMaritalStatus(true);
        // System.out.println(mumsie.name);
        // mumsie.intro();

        // Student tomi = new Student();
        // tomi.name = "Tomisin";
        // tomi.address = "Lugbe, Abuja";
        // tomi.gPA = 4.95F;
        // tomi.setMaritalStatus(true);
        // // System.out.println(tomi.name + " has a GPA of " + tomi.gPA);
        // tomi.intro();
        // tomi.shimmer();


        // A pointA = new A(0, 1);
        // B pointB = new B(2, 1, 1);
        // pointA.show();
        // pointB.show();

        Figure figRef;

        // abstract class used as interface
        Figure box = new Rectangle(3, 4);
        figRef = box;
        System.out.println("Area: "  + figRef.area() + "m^2");

        Triangle samosa = new Triangle(4.65, 7.88);
        figRef = samosa;
        System.out.println("Area: "  + figRef.area() + "m^2");

        // No longer possible since Figure is not abstract
        // Figure shadow = new Figure(4, 5);
        // System.out.println("Area: "  + shadow.area() + "m^2");

        Landline rotary = new Landline("Panasonic");
        System.out.println(rotary.getModel());
        rotary.call("09096387710");
        rotary.sendMessage("Hey Naz", "08012355789");

        MobilePhone pixel = new MobilePhone("Google Pixel 6a");
        pixel.call("08125887094", "Mummy");
        pixel.sendMessage("09056877719", "Daddy, please I need more money");
    }
}
