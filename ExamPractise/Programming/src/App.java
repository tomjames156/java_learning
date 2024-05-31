import shapes.*;

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

        Figure box = new Rectangle(3, 4);
        System.out.println("Area: "  + box.area() + "m^2");

        Figure samosa = new Triangle(4.65, 7.88);
        System.out.println("Area: "  + samosa.area() + "m^2");

        Figure shadow = new Figure(4, 5);
        System.out.println("Area: "  + shadow.area() + "m^2");
    }
}
