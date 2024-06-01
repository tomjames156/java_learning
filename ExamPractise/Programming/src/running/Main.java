package running;

import living_things.*;

public class Main{

    public static void main(String[] args){

        Animal tiger = new Animal("cat", "Tiger", "land");
        tiger.speak();

        Reptile anaconda = new Reptile("Anaconda", "land");
        anaconda.speak();

        Temperature freezing = new Temperature(0);
        System.out.println("The freezing point of water is " + freezing.value + "deg C or " + freezing.toFarenheit() + "deg F");

        Temperature boiling = new Temperature(212);
        System.out.println("The boiling point of water is " + boiling.value + "deg F or " + boiling.toCelsius() + " deg C" );
    }
}

/**
 * BUGS FOUND
 * 2. Array list is zero-indexed
 * - For the sentinel value escape or invalid score, print something out
 * 3. Static variables cannot access public variables or non static vars, so they should only use params in their computation
 */