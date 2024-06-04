package polymorphs;

public class Person {
  public String name;
  
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

  public boolean canVote(int age){
    if(age >= 18){
      return true;
    }else{
      return false;
    }
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

    boolean eligibility = busola.canVote(17);

    if(eligibility){
      System.out.println(busola.name + " is eligible to vote.");
    }else{
      System.out.println(busola.name + " is ineligible to vote.");
    }
  }
}