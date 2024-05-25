public class Jacqen{

    public static void main(String[] args){

        Guest tywin = new Guest("Tywin Lannister");
        System.out.println(tywin.name);

        String greeting = "Valhar Moghulis";
        greeting = greeting + " / Dohaeris"; // Strings can be reassigned new values
        System.out.println(greeting.charAt(0));
        System.out.println(greeting);

        String[] cars = {"Dusty", "Lightning", "Pearl"};
        // cars = {"Joe", "Boe", "Toe"}; // arrays cannot be reassigned to a new array
        cars[2] = "Jenny"; // array references are mutable

        StringBuilder deutscheGreeting = new StringBuilder("Guten Tag");
        deutscheGreeting.append(" Herr Tomski");
        System.out.println(deutscheGreeting);
        System.out.println(cars[2]);

        final String surname = "Akinwande";
        // surname = "AK"; // cannot reassign cuz of the immutable reference
        System.out.println(surname + " Tomisin");

        final StringBuilder mySurname = new StringBuilder("Akinwande");
        // mySurname = new StringBuilder("Jello"); // immutable cannot reassign the stringbuilder object
        mySurname.delete(2, 9); // can mutate the string stored in the object   
        System.out.println(mySurname + " Tomisin");
    }
}