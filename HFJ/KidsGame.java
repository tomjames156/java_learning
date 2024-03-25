public class KidsGame{

    public static void main(String args[]){
        int bottles = 10;
        String singular = "bottle";
        String plural = "bottles";

        while(bottles > 0){
            if(bottles > 1){
                System.out.println(bottles + " " + plural + " of soda left");
            }else{
                System.out.println(bottles + " " + singular + " of soda left");
            }
            bottles = bottles - 1;
        }

        System.out.print("No more bottles of soda left");
    }
}