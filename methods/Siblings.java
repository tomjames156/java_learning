public class Siblings{

    static int plusFive(int x){
        return 5 + x;
    }

    static void sibling(String name, int age){
        System.out.println(name + " Ali is " + age + " years old.");
    }

    public static void main(String[] args){

        sibling("Danladi", 18);
        sibling("Yasmin", 20);
        sibling("Danjuma", 18);

        System.out.println(plusFive(3));
    }
}