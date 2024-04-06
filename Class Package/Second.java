public class Second{

    public static void main(String[] args){
        Main myObj = new Main();
        System.out.println(myObj.x);
        Main.cook();

        Car myCar = new Car();
        myCar.fullThrottle();
        System.out.println("My car is " + myCar.colour);
        myCar.speed(80);
    }
}