public class Car{

    int currentSpeed = 30;
    String brand;
    String colour;

    public void fullThrottle(){
        System.out.println("Going to full speed in 3...2..1.");
    }

    public void speed(int speed){
        System.out.println("Your current speed is now " + (speed + 10) + "km/h.");
    }
}