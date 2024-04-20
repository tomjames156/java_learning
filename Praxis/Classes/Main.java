import java.math.BigInteger;

public class Main{

    public static void main(String[] args){

        BigInteger myCash = BigInteger.valueOf(1900000000);

        Car subaru = new Car();
        subaru.colour = "red";
        subaru.brand = "Toyota";
        subaru.currentSpeed = 60;

        subaru.fullThrottle();
        subaru.speed(subaru.currentSpeed);

        System.out.println("I have $" + myCash + " in my account");
    }
}