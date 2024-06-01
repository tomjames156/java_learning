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
 * 1. 
 */