public class Car{
    String name = "Honda";
    String colour = "black";  
    int miles = 0;

    static void repairs(){
        System.out.print(miles);
        // if(miles == 0){
        //     System.out.println("You just got this car, it doesn't need repairs");
        // }else if(miles <= 20){
        //     System.out.println("Don't worry, it still doesn't need repairs");
        // }else{
        //     System.out.println("Run, don't walk to the mechanic. Urgent Repairs are necessary");
        // }
    }

    public void fullThrottle(){
        System.out.println("The car is going as fast as it can");
    }

    public void speed(int maxSpeed){
        System.out.println("Max speed is: " + maxSpeed + "km/h");
    }
}