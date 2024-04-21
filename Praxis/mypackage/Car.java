package mypackage;

public class Car{

    int currentSpeed = 30;
    String brand;
    String colour;
    static final String description = "\nThis is a class that represents a Car with attributes like: \n\t- currentSpeed, \n\t- brand \n\t- colour. \nIt does not use a constructor\n";

    // private Car(int _currentSpeed, String _brand, String _colour){
    //     currentSpeed = _currentSpeed;
    //     brand = _brand;
    //     colour = _colour;
    // }

    static void fullThrottle(){
        System.out.println("Going to full speed in 3...2..1.");
    }

    public void speed(int speed){
        System.out.println("Your current speed is now " + (speed + 10) + "km/h.");
    }

    // public static void main(String[] args){

    //     Car subaru = new Car(50, "red", "Subaru");
    //     subaru.currentSpeed = 50;
    //     subaru.colour = "red";
    //     subaru.brand = "Subaru";

    //     subaru.fullThrottle();
    //     subaru.speed(subaru.currentSpeed);
    // }
}