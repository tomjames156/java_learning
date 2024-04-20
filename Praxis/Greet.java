import java.util.Scanner;

public class Greet{
    static int myAge = 13;

    static void greet(){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Please enter your name: \b");
        String fName = myInput.nextLine();
        System.out.println("Hey, how are ya " + fName);
    }

    static int getBirthYear(){
        // birthyear = 0
        Scanner userInput = new Scanner(System.in);
        // print intro text
        System.out.println("Enter your age and I will tell you what year you were born");
        // get age from user input
        int userAge = userInput.nextInt();
        if(userAge < 0){ // check that age is >= 0
            return - 1;
        }

        return 2024 - userAge; // calculate birth year  return birthyear
        
    }

    static void aly(String fname){
        System.out.println(fname + " Ali");
    }

    public static void main(String[] args){
        System.out.println("Please enter your name: ");
        greet();
        // int div = 30, dive = 0;
        int x = -4 + 4 % 3 * 13 + 2;
        // float age = div/dive;
        String myName = "Tomisin";
        System.out.println("I hear you are " + myName.length() + " years old");
        aly("Muhammed");
        aly("Kunmise");
        aly("Oreva");
        int myYOB = getBirthYear();
        System.out.println("You were born in " + myYOB);
    }
}