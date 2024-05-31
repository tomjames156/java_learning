public class Student extends Person{
    
    float gPA;

    public Student(String _name, String _address, float _gPA){
        name = _name;
        address = _address;
        gPA = _gPA;
    }

    public void showGPA(){
        System.out.println(name + "'s GPA is " + gPA);
    }

    public static void main(String[] args){

        Student chuks = new Student("Chuks", "Port Harcourt", 3F);
        chuks.getInfo();
    }
}