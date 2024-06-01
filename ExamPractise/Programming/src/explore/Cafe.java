package explore;
import java.util.*;

public class Cafe extends Restaurant{
    private List<String> cuisine;

    public Cafe(String _name, String _location, String _type, List<String> _cuisine){
        super(_name, _location, _type);
        cuisine = _cuisine;
    }

    public List<String> getOptions(){
        return cuisine;
    }

    public void showMenu(){

        System.out.println("\n" + this.getName() + "'s menu:");

        for(String item : cuisine){
            System.out.println("\t*" + item);
        }
    }

    public void addItem(String newItem){
        cuisine.add(newItem);
        System.out.println("\n" + newItem + " has been added to " + this.getName() + "'s menu");
    }
}
