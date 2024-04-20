public class Overload{

    static int area(int radius){
        System.out.print("Integer: ");
        return 22 / 7 * radius * radius;
    }

    static float area(float radius){

        float pi = 22F / 7F;
        System.out.print("Float: ");
        return pi * radius * radius;
    }

    static double area(double radius){
        double num = 22F;
        double den = 7F;
        double pi = num / den;
        System.out.print("Double: ");
        return pi * radius * radius;
    }


    public static void main(String[] args){
        int intRad = 6;
        float floatRad = 7.5F;
        double doubleRad = 6.371;
        System.out.println(area(intRad));
        System.out.println(area(floatRad));
        System.out.println(area(doubleRad));
    }
}