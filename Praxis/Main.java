import java.math.BigInteger;
import java.util.*;
import mypackage.*;

public class Main{

    public static void main(String[] args){

        List<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(0);
        myNumbers.add(2);
        myNumbers.add(4);
        myNumbers.add(10);
        myNumbers.add(6);

        System.out.println(myNumbers.get(3));

        BigInteger myCash = BigInteger.valueOf(1900000000);

        // Car subaru = new Car(50, "red", "Toyota");
        Car subaru = new Car();
        subaru.currentSpeed = 55;
        subaru.colour = "red";
        subaru.brand = "Subaru";

        // subaru.fullThrottle(); // static method
        subaru.speed(subaru.currentSpeed);

        // System.out.println(Car.description); // static method
        System.out.println("I have $" + myCash + " in my account");

        Student Noah = new Student();
        Noah.setFullName("Noah", "Akinwande", "");
        Noah.setGPA(4.95F);
        System.out.println(Noah.getFname() + " " + Noah.getLname().toUpperCase() + " did very well this semester. He got a " + Noah.getGPA());
    }
}