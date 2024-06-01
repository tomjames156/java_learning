package living_things;

public class Animal{
    String type;
    String name;
    String habitat;

    public Animal(String _type, String _name, String _habitat){
        type = _type;
        name = _name;
        habitat = _habitat;
    }

    public void speak(){
        System.out.println("animal sound");
    }
}