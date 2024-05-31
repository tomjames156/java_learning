package polymorphs;

public class Employee extends Person{
    String dept;
    
    public Employee(String _name, String _dept){
      super(_name);
      dept = _dept;
    }
    
    public void intro(){
      System.out.println("Hi I'm " + name + ". I work in the " + dept + " department");
    }
    
    public String getName(){
      System.out.println("\nEmployee Name: " + name);
      return name;
    }
}
