public class Plus{

    static int plusMethod(int x, int y){
        return x + y;
    }

    static double plusMethod(double x, double y){
        return x + y;
    }

    public static void main(String[] args){
        int sum1 = plusMethod(8, 2);
        double sum2 = plusMethod(7.75, 2.75);
        System.out.println("int: " + sum1);
        System.out.println("double: " + sum2);
    }
}