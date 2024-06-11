package debugging;

import java.util.*;
public class Numbers {
    List<Integer> numbers;

    public void addNumbers(){
        System.out.println("Enter whole numbers to find the maximum number\nEnter q to end the program");
        Scanner myScanner = new Scanner(System.in);

        while(true){
            System.out.print("> ");
            String myNumberString = myScanner.nextLine();

            if(myNumberString.charAt(0) == 'q'){
                break;
            }

            int myNumber = Integer.valueOf(myNumberString);
            numbers.add(myNumber);
        }

        myScanner.close();
        System.out.println("Quitting...\nDone\nNumbers = " + numbers);
    }

    public int maximumNumberSearch(){
        int max = numbers.get(0);
        for(int number : numbers){
            if(number > max){
                max = number;
            }
        }
        return max;
    }

    public static void main(String[] args){
        Numbers myNumbers = new Numbers();
        myNumbers.numbers = new ArrayList<Integer>();
        myNumbers.addNumbers();
        System.out.println("Biggest Number = " + myNumbers.maximumNumberSearch());
    }

}
