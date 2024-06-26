package running;

import living_things.*;
import java.util.*;

public class Main{

    // public static int fibonacci(int len){
    //     while(len > 0){
    //         return fibonacci(int len - 1);
    //     }

    //     System.out.print()

    //     return 0;
    // }

    public static void main(String[] args){

        System.out.println("Enter the day of the week");
        Scanner myScanner = new Scanner(System.in);
        String dayOfTheWeek = myScanner.nextLine();
        
        switch(dayOfTheWeek){
            case "Monday":
                System.out.println("Ughhh its Monday");
                break;
            case "Tuesday":
                System.out.println("It's the day after Monday");
                break;
            case "Wednesday":
                System.out.println("Halfway through the week");
                break;
            case "Thursday":
                System.out.println("One more day to go");
                break;
            case "Friday":
                System.out.println("TGIF!!!");
                break;
            default:
                System.out.println("It's the Weekend");
        }

        Animal tiger = new Animal("cat", "Tiger", "land");
        tiger.speak();

        Reptile anaconda = new Reptile("Anaconda", "land");
        anaconda.speak();

        Temperature freezing = new Temperature(0);
        System.out.println("The freezing point of water is " + freezing.value + "deg C or " + freezing.toFarenheit() + "deg F");

        Temperature boiling = new Temperature(212);
        System.out.println("The boiling point of water is " + boiling.value + "deg F or " + boiling.toCelsius() + " deg C" );

        Temperature roomTemp = new Temperature(66.7F);
        System.out.println("The average room temperature is " + roomTemp.value + "deg C or " + roomTemp.convert() + " deg F");

        myScanner.close();

        Employee tomi = new Employee("Tomisin", 2024, 500000, "Abuja, Nigeria", 4);
        Employee temi = new Employee("Temitope", 2022, 600000, "Abuja, Nigeria", 6);
        Employee buslet = new Employee("Busola", 2023, 550000, "Lagos, Nigeria", 5);

        System.out.println("Name      Year of Joining         Address   Salary");
        temi.showInfo();
        tomi.showInfo();
        buslet.showInfo();
    }
}

/**
 * BUGS FOUND
 * 2. Array list is zero-indexed
 * - For the sentinel value escape or invalid score, print something out
 * 3. Static variables cannot access public variables or non static vars, so they should only use params in their computation
 * 4. For the calculation, let the last item outside the first bracket be without a bracket. Only one bracket is necessary for each conversion
 * - If you put a number w decimal make sure to add F at the end
 * - To get a char as input from the scanner, use nextline().charAt(0)
 * 5. Scanner class is in the java.util package and dont forget to add the String[] args to the main function. Always close the scanner object to avoid memory leakages
 * You cannot use the objects attributes in a static method
 */