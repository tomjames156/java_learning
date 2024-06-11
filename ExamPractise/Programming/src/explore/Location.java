package explore;

import java.util.*;
import polymorphs.*;

public class Location{
    private String name;
    private String location;

    public Location(String _name, String _location){
        name = _name;
        location = _location;
    }

    public String getName(){
        return name;
    }

    public String getLocation(){
        return location;
    }

    public static void main(String[] args){
        Location school = new Location("Nile University", "Airport Rd, Abuja");
        Person tomi = new Student("Tomi", "Software engineering");
        tomi.intro();
        System.out.println(tomi.name + " is going back to " + school.name + " located in " + school.location);

        Restaurant cilantro = new Restaurant("Cilantro", "Abuja, Nigeria", "Indian");
        cilantro.intro();

        List<String> akCafeMenu = new ArrayList<String>();
        akCafeMenu.add("Akara");
        akCafeMenu.add("Custard");
        akCafeMenu.add("Pancakes");
        akCafeMenu.add("Fried Eggs");
        Cafe akaraCafe = new Cafe("Akara Cafe", "Gwarimpa, Abuja", "Nigerian", akCafeMenu);
        akaraCafe.showMenu();
        akaraCafe.addItem("Pap");
        akaraCafe.addItem("Hot chocolate");
        akaraCafe.showMenu();

        Map<String, String> recentlyVisitedPlaces = new HashMap<String, String>();
        recentlyVisitedPlaces.put("Monday", "School");
        recentlyVisitedPlaces.put("Tuesday", "MagicLand");
        recentlyVisitedPlaces.put("Wednesday", "Turkish Village");
        recentlyVisitedPlaces.put("Thursday", "Veritas");
        recentlyVisitedPlaces.put("Friday", "Baze University");

        for(String day : recentlyVisitedPlaces.keySet()){
            System.out.println("I visited " + recentlyVisitedPlaces.get(day) + " on " + day);
        }

        System.out.println(school.name.substring(10, 14));
    }
}