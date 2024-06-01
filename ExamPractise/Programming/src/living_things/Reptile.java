package living_things;

public class Reptile extends Animal{
    
    public Reptile(String _name, String _habitat){
        super("reptile", _name, _habitat);
    }

    public void speak(){
        System.out.println("hiss");
    }

}