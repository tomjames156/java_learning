import polymorphs.*;

public class App {
    public static void main(String[] args){

        // Person mumsie = new Person();
        // mumsie.name = "Mummy";
        // mumsie.address = "Egbeda, Lagos";
        // mumsie.setMaritalStatus(true);
        // System.out.println(mumsie.name);
        // mumsie.intro();

        // Student tomi = new Student();
        // tomi.name = "Tomisin";
        // tomi.address = "Lugbe, Abuja";
        // tomi.gPA = 4.95F;
        // tomi.setMaritalStatus(true);
        // // System.out.println(tomi.name + " has a GPA of " + tomi.gPA);
        // tomi.intro();
        // tomi.shimmer();


        // A pointA = new A(0, 1);
        // B pointB = new B(2, 1, 1);
        // pointA.show();
        // pointB.show();

        // Studenta noah = new Studenta("Noah", "Business Administration");
        Studenta noah = new Studenta();
        noah.setName("Noah");
        noah.getName();
        // noah.intro();

        // create a Person ref variable
        Person ref;
        System.out.println(ref);

        ref = noah;

        // Employee temi = new Employee("Temitope", "Records");
        Employee temi = new Employee();
        temi.setName("Temitope");
        temi.getName();
        // temi.intro();
    }
}
