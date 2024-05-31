public class Person{
    String name;
    String address;

    public Person(String _name, String _address){
        name = _name;
        address = _address;
    }

    public String[] getInfo(){
        String[] info = new String[] {name, address};
        return info;
    }

    public static void main(String[] args){

        Person chuks = new Person("Chuks", "Port Harcourt");
        chuks.getInfo();
    }
}