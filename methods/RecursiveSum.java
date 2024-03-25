public class RecursiveSum{

    static int sumNumbers(int number){

        if(number > 0){
            return number + sumNumbers(number - 1);
        }else{
            return 0;
        }
    }

    public static void main(String[] args){
        int sum10 = sumNumbers(10);
        System.out.println("The sum of number 1 - 10 is " + sum10);
    }
}