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

    static void getSequence(int n){
        System.out.println(n);

        if(n == 1){
            return;
        }

        if(n % 2 == 0){
            n = n / 2;
        }else if(n % 2 == 1 && n != 1){
            n = (3 * n) + 1;
        }

        getSequence(n);
    }

    public static void main(String[] args){
        System.out.println(hailStone(5));
        getSequence(3);
    }
}