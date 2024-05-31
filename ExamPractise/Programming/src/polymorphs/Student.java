package polymorphs;

public class Student extends Person{
    String department;
    
    public Student(String _name, String _department){
      super(_name);
      department = _department;
    }
    
    public void intro(){
      System.out.println("Hi I'm " + name + ", I study " + department);
    }
    
    public String getName(){
      System.out.println("\nStudent Name: " + name);
      return name;
    }
  }
