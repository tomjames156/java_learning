import java.util.*; 

public class Practise{

    public static void main(String[] args){

        // 1
        // String message = "This is a string variable";

        // System.out.println(message);


        // 2
        // String name = "Alice";
        // int age = 30;
        // int secondAge = 40;

        // System.out.println(name, 40); Multiple variable printing aint possible

        // System.out.println("My name is " + name + " " + "and I am " + age + " years old");


        // 3
        // Scanner userInput = new Scanner(System.in);
        // System.out.println("Hey there, What's your name?");
        // String userName = userInput.nextLine();
        // System.out.println("Good morning " + userName);

        // 4
        // System.out.println("Enter 2 numbers and get their sum and difference");
        // int num1 = userInput.nextInt();
        // int num2 = userInput.nextInt();
        // int sum = num1 + num2;
        // int diff = num1 - num2;
        // System.out.println("Sum = " + num1 + " + " + num2 + " = " + sum);
        // System.out.println("Difference = " + num1 + " - " + num2 + " = " + diff);

        
        // 5
        // System.out.println("Please enter your age to check your voting eligibility");
        // int userAge = userInput.nextInt();
        // if(userAge > 18){
        //     System.out.println("You are eligible to vote");
        // }else{
        //     System.out.println("You are not eligible to vote");
        // }

        // 6
        Car blue = new Car();
        Car red = new Car();

        blue.color = "blue";
        blue.mileage = 20;
        red.color = "red";

        System.out.println("My new car is " + blue.color);
        System.out.println("My old car is " + red.color);
        System.out.println("My new car has " + (400 - blue.mileage) + " miles left on it");

        
        // 7
        Book fave = new Book();
        fave.title = "The Alchemist";
        fave.author = "Paul Coehlo";
        System.out.println("My favourite book is " + fave.title + " written by " + fave.author);
        

        // 8
        Student courseRep = new Student();
        courseRep.name = "Shuks";
        courseRep.rollNumber = 20220388;
        courseRep.maths = 90;
        courseRep.science = 80;
        courseRep.english = 85;

        Student Chuks = new Student();
        Chuks.name = "Chuks";
        Chuks.rollNumber = 20220419;
        Chuks.maths = 90;
        Chuks.science = 80;
        Chuks.english = 85;

        Student[] students = {Chuks, courseRep};

        for(Student student: students){
            System.out.println("\n\nName: " + student.name);
            System.out.println("Roll Number: " + student.rollNumber);
            System.out.println("GRADES");
            System.out.println("Mathematics: " + student.maths);
            System.out.println("Science: " + student.science);
            System.out.println("English: " + student.english);
        }
        
        // System.out.println("Student Name: " + courseRep.name);
        // System.out.print("\n\n");
        // System.out.println("Student Name: " + courseRep.name);
    }
}