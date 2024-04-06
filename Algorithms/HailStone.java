import java.util.*;

public class HailStone{

    public static List<Integer> hailStone(int n){
        List<Integer> list = new ArrayList<Integer>();

        if(n <= 0){
            System.out.println("Please enter a number greater than zero (0)");
        }

        while(n != 1){
            list.add(n);
            if(n % 2 == 0){
                n /= 2;
            }else{
                n = (3 * n) + 1;
            }
        }
        list.add(n);
        return list;
    }

    public static void main(String[] args){
        hailStone(5);
    }
}