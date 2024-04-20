public class Loop{

    static int naturalNoSeries(int end){
        int sum = 0;

        while(end > 0){
            sum += end;
            end--;
        }

        return sum;
    }

    static void checkBirthday(int day){

        switch(day){
            case 28:
                System.out.println("It's your birthday, Yayyy");
                break;
            case 21:
                System.out.println("It's your mum's birthday");
                break;
            case 1:
                System.out.println("It's the 1st of March . It's about to be your birthday");
                break;
            default:
                System.out.println("It's not your birthday");
        }
    }

    public static void main(String[] args){
        int i = 1;
        String[] people = {"Tomisin", "Temitope", "Busola"};

        System.out.println("1, 2, Ready... ");
        do{
            System.out.println("\tBlood of Jesus");
            i++;
        }while(i <= 7);

        for(int j = 1; j < 11; j++){
            if(j ==  10){
                System.out.print(j + " = ");
            }else if(j > 1){
                continue;
            }else{
                System.out.print(j + " + ... + ");
            }
            
        }

        int series = naturalNoSeries(10);
        System.out.print(series);

        System.out.println("\nThese are Noah's siblings:");
        for(String sibling : people){
            System.out.println("\t" + sibling);
        }

        checkBirthday(21);
    }
}