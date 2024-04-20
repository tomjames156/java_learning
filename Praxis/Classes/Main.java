import java.math.BigInteger;

public class Main{

    public static void main(String[] args){

        BigInteger myCash = BigInteger.valueOf(1900000000);

        // Car subaru = new Car(50, "red", "Toyota");
        Car subaru = new Car();
        subaru.currentSpeed = 55;
        subaru.colour = "red";
        subaru.brand = "Subaru";

        subaru.fullThrottle();
        subaru.speed(subaru.currentSpeed);

        System.out.println(Car.description);
        System.out.println("I have $" + myCash + " in my account");
    }
}