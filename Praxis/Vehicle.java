public class Vehicle{

    String make;
    String model;

    public void displayDetails(){
        System.out.println(this.make + " " + this.model);
    }

    public static void main(String[] args){

        Vehicle civic = new Vehicle();
        civic.make = "Honda";
        civic.model = "Civic";
        civic.displayDetails();


        Car chevy = new Car();
        chevy.make = "Chevrolet";
        chevy.model = "Camaro";
        chevy.year = 2020;
        chevy.displayDetails();

    }
}