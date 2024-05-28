import java.math.*;

public class Plus{

    static int plusMethod(int x, int y){
        return x + y;
    }

    static double plusMethod(double x, double y){
        return x + y;
    }

    public static void main(String[] args){
        BigInteger netWorth = new BigInteger("200000000");
        BigInteger charity = new BigInteger("50000000");
        BigInteger nextOfKin = netWorth.subtract(charity);

        System.out.println("Tomi's next of kin got a " + nextOfKin + " payout");
        int sum1 = plusMethod(8, 2);
        double sum2 = plusMethod(7.75, 2.75);
        System.out.println("int: " + sum1);
        System.out.println("double: " + sum2);
    }
}