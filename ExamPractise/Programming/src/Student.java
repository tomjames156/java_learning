public class Student extends Person{
    float gPA;

    public Student(){
        String status = "";
    }

    public void shimmer(){
        System.out.println("Hi my name is " + name + ". I have a GPA of " + gPA);
    }
}