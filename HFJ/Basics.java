public class Basics{

    public static void main(String args[]){
        int age = 10;
        String name = "Tomi";
        
        if(age < 10){
            System.out.print("Hello");
        }else{
            System.out.println("Hi " + name);
        }

        // while(age > 0){ // only booleans can be tested as conditional test values
        //     System.out.println(age);
        //     age = age - 1;
        // }

        int x = 1;

        while(x < 3){
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }

        if(x == 3){
            System.out.print("Do");
        }
    }
}