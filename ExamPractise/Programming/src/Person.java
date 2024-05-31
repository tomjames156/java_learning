public class Person {

    protected String name;
    protected String address;
    private boolean maritalStatus;

    public Person(){
        System.out.println("I am a person");
    }

    public void setMaritalStatus(boolean status){
        maritalStatus = status;
    }

    public void intro(){
        System.out.print("\nHi my name is " + name  + ". I live in " + address + " and I am ");
        if(maritalStatus){
            System.out.println("married");
        }else{
            System.out.println("not married");
        }
    }
}
