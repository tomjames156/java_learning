package explore;

import polymorphs.*;

public class Location{
    String name;
    String location;

    public Location(String _name, String _location){
        name = _name;
        location = _location;
    }

    public static void main(String[] args){
        Location school = new Location("Nile University", "Airport Rd, Abuja");
        Person tomi = new Student("Tomi", "Software engineering");
        tomi.intro();
        System.out.println(tomi.name + " is going back to " + school.name + " located in " + school.location);
    }
}