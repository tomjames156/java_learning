package running;

import living_things.*;

public class Main{

    public static void main(String[] args){

        Animal tiger = new Animal("cat", "Tiger", "land");
        tiger.speak();

        Reptile anaconda = new Reptile("Anaconda", "land");
        anaconda.speak();
    }
}

/**
 * BUGS FOUND
 * 1. Array list is zero-indexed
 * - For the sentinel value escape or invalid score, print something out
 */