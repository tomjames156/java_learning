// import Classes.*;

public class Recursive{

    static int addNumbersInRange(int num1, int num2){

        if(num2 >= num1){
            return num2 + addNumbersInRange(num1, num2 - 1);
        }else{
            return 0;
        }
    }

    static int addNumbersBelow(int start){
        
        if(start > 0){
            return start + addNumbersBelow(start - 1);
        }else{
            return 0;
        }
    }

    public static void main(String[] args){

        System.out.println(addNumbersInRange(3, 5));
        System.out.println(addNumbersBelow(3));

        // Car chevy = new Car(70, "grey", "Chevrolet");
        // System.out.println(chevy.brand);
    }
}