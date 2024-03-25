public class Loops{

    public static void main(String[] args){
        int i = 0;
        
        do{
            System.out.println(i);
            i++;
        }while(i < 5);

        String day = "Wednesday";

        switch(day){

            case "Monday":
                System.out.print("Noo");
                break;
            case "Tuesday":
                System.out.print("Ohkay");
                break;
            case "Wednesday":
                System.out.print("Half-way there");
                break;
            case "Thursday":
                System.out.print("Almost");
                break;
            case "Friday":
                System.out.print("TGIF");
                break;
            default:
                System.out.print("TGIF");
                break;
        }

    }
}