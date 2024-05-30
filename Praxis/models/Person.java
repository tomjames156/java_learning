package models;

public class Person{
    int age;
    String name;
    String from;

    public Person(int _age, String _name, String _from){
        age = _age;
        name = _name;
        from = _from;
    }

    public void introduce(){
        System.out.println(name + ": Hi I'm " + name + ". I am " + age + " years old from " + from + ".");
    }
    
}