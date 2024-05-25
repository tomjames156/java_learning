import java.util.*;

public class People{

    public static void main(String[] args){

        Guest maryam = new Guest("Arinola");
        Guest tomi = new Guest("Tomisin");
        Guest red = new Guest("Fareyd");

        String jose = "Jose";
        String zee = "Zee";
        String rava = "Rava";

        List<Guest> guestList = new ArrayList<Guest>();
        guestList.add(maryam);
        guestList.add(tomi);
        guestList.add(red);

        List<String> strangers = new LinkedList<String>();
        strangers.add(jose);
        strangers.add(zee);
        strangers.add(rava);

        Map<String, String> bestFriends = new HashMap();
        bestFriends.put("home", "Noah");
        bestFriends.put("church", "KC");
        bestFriends.put("school", "Otta");

        System.out.println();

        for(Guest guest : guestList){
            System.out.println(guest.name + " is on the list");
        }

        System.out.println();

        for(String stranger : strangers){
            System.out.println(stranger + " is not on the list");
        }

        System.out.println();

        for(String stranger : strangers){
            System.out.println(stranger + " is not on the list");
        }

        System.out.println();

        for(String location : bestFriends.keySet()){
            System.out.println(bestFriends.get(location) + " is my best friend from " + location);
        }

        // for(int i = 0; i < guestList.size(); i++){
        //     System.out.println(guestList.get(i).name + " is on the list");
        //     System.out.println(strangers.get(i) + " is not on the list");
        // }
    }
}