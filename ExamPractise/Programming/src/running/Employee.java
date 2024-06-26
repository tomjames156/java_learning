package running;

public class Employee {
    String name;
    int yearOfJoining;
    int salary;
    String address;
    int workHours;

    public Employee(String _name, int _yearOfJoining, int _salary, String _address, int _workHours){
        name = _name;
        yearOfJoining = _yearOfJoining;
        salary = _salary;
        address = _address;
        workHours = _workHours;
    }

    public static void getInfo(int _salary, int _workHours){
        System.out.println("This Employee works for " + _workHours + " hours a day and earns a monthtly salary of $" + _salary + ".");
    }

    public void showInfo(){
        System.out.println(name + "     " + yearOfJoining + "       " + address + "       " + salary);
    }

    public void addSal(){
        if(salary < 500){
            salary += 10;
            System.out.println("$10 bonus added to salary");
        }else{
            System.out.println("Not eligible for bonus");
        }
    }

    public void addWork(){
        if(workHours > 6){
            salary += 5;
            System.out.println("$5 bonus added to salary");
        }else{
            System.out.println("Not eligible for bonus");
        }
    }

    public int getSalary(){
        System.out.println("Final salary: $" + salary);
        return salary;
    }


    public static void main(String[] args){
        Employee emp1 = new Employee("Jade", 2024, 500000, "Berkshire, Central London, House 40", 7);
        Employee.getInfo(1000, 7);
        emp1.addSal();
        emp1.addWork();
        emp1.getSalary();
    }
}
