package running;

import java.util.*;

public class Calculator {
    int num1;
    int num2;

    public Calculator(int _num1, int _num2){
        num1 = _num1;
        num2 = _num2;
    }

    public int add(){
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        return result;
    }

    public int subtract(){
        int result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        return result;
    }

    public int multiply(){
        int result = num1 * num2;
        System.out.println(num1 + " X " + num2 + " = " + result);
        return result;
    }

    public double divide(){
        double result = (double) num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + result);
        return result;
    }

    public static int factorial(int num){
        if(num > 0){
            return num * factorial(num - 1);
        }else{
            return 1;
        }
    }

    // Prints out a fibonacci sequence
    public static void fib(int prev, int curr, int max){
        if(curr == 1 && prev == 0){
            System.out.print(1 + ", ");
        }

        if(max - 1 > 0){
            System.out.print((prev + curr) + ", ");
            fib(curr, prev + curr, max - 1);
        }else{
            System.out.println("...");
        }
        

        // System.out.println(1);
        // System.out.println(1 + 0);
        // System.out.println(1 + 1);
        // System.out.println(1 + 1 + 1);
        // System.out.println(1 + 1 + 1 + 1 + 1);
    }

    // Prints out n-th term of a fib sequence
    // https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
    public static int fib(int n){
        if(n <= 1){
            return n;
        }else{
            return fib(n - 1) + fib(n -2);
        }
    }


    public static void main(String[] args){

        System.out.println("Enter 2 numbers to get the results of basic arithmetic operations");
        System.out.print("Num 1: ");
        Scanner myScanner = new Scanner(System.in);
        int num1 = myScanner.nextInt();
        System.out.print("Num 2: ");
        int num2 = myScanner.nextInt();
        
        Calculator myCalc = new Calculator(num1, num2);
        myCalc.add();
        myCalc.subtract();
        myCalc.multiply();
        myCalc.divide();

        System.out.println(Calculator.factorial(3));
        Calculator.fib(0, 1, 3);
        

        System.out.println("Enter the length of your fibonacci sequence");
        System.out.print("=> : ");
        int sequenceLength = myScanner.nextInt();
        myScanner.close();

        for(int i = 1; i <= sequenceLength; i++){
            if(i == sequenceLength){
                System.out.println(Calculator.fib(i) + "...");
            }else{
                System.out.print(Calculator.fib(i) + ", ");
            }
        }
    }
}
