package running;

import living_things.*;

public class Main{

    // public static int fibonacci(int len){
    //     while(len > 0){
    //         return fibonacci(int len - 1);
    //     }

    //     System.out.print()

    //     return 0;
    // }

    public static void main(String[] args){

        Animal tiger = new Animal("cat", "Tiger", "land");
        tiger.speak();

        Reptile anaconda = new Reptile("Anaconda", "land");
        anaconda.speak();

        Temperature freezing = new Temperature(0);
        System.out.println("The freezing point of water is " + freezing.value + "deg C or " + freezing.toFarenheit() + "deg F");

        Temperature boiling = new Temperature(212);
        System.out.println("The boiling point of water is " + boiling.value + "deg F or " + boiling.toCelsius() + " deg C" );

        Temperature roomTemp = new Temperature(66.7F);
        System.out.println("The average room temperature is " + roomTemp.value + "deg C " + roomTemp.convert() + " deg F");
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
 */