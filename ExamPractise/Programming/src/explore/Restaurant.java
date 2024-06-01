package explore;

public class Restaurant extends Location{
    private String type;

    public Restaurant(String _name, String _location, String _type){
        super(_name, _location);
        type = _type;
    }

    public String getType(){
        return type;
    }

    public void intro(){
        System.out.println(this.getName() + " is a " + this.getType() + " restaurant located in " + this.getLocation() + "." );
    }
}
