

public class Person {
  protected String name;
  
  public Person(String _name){
    name = _name;
  }
  
  public void intro(){
    System.out.println("Hi I'm " + name);
  }
  
  public String getName(){
    System.out.println("\nPerson Name: " + name);
    return name;
  }
  
  public static void main(String[] args) {
    
    Person ref;
    
    Person tomi = new Person("Tomisin");
    ref = tomi;
    
    ref.getName();
    ref.intro();
    
    Student noah = new Student("Noah Akinwande", "Business Administration");
    ref = noah;
    ref.getName();
    ref.intro();
    
    Employee temi = new Employee("Temitope Akinwande", "Records");
    ref = temi;
    ref.getName();
    ref.intro();
    
    Person busola = new Student("Busola Akinwande", "Nursing");
    ref = busola;
    ref.getName();
    ref.intro();
  }
}

class Student extends Person{
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

class Employee extends Person{
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