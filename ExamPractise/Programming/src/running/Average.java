package running;

import java.util.*;

public class Average {

    public static float getAverage(List<Integer> numbers){
        int sum = 0;

        for(int number : numbers){
            sum += number;
        }

        return (float) sum / numbers.size();
    }

    public static void main(String[] args){
        List<Integer> grades = new ArrayList<Integer>();
        Scanner myScanner = new Scanner(System.in);

        System.out.print("How many grades do you want to enter: ");
        int noOfGrades = myScanner.nextInt();

        for(int i = 0; i < noOfGrades; i++){
            System.out.println("Enter a number: ");
            int grade = myScanner.nextInt();
            grades.add(grade);
        }

        myScanner.close();

        System.out.println(grades);
        System.out.println("The average of " + grades.size() + " numbers is " + Average.getAverage(grades));
    }

}
