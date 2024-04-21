public class Main{

    public static void main(String args[]){
        Museum chineseCentre = new Museum();
        chineseCentre.setAddress("Wuse");
        chineseCentre.setRating(4.56F);
        chineseCentre.setName("China Culture Centre");
        chineseCentre.setBudget(new int[] {1000, 1500});
        chineseCentre.about();

        Restaurant blueCabana = new Restaurant();
        blueCabana.setName("Blue Cabana");
        blueCabana.setBudget(new int[] {2000, 4500});

        Restaurant akCafe = new Restaurant();
        akCafe.setName("Akara Cafe");
        akCafe.setAddress("Gwarimpa");
        akCafe.setRating(4.95F);

        akCafe.setBudget(new int[] {1500, 4500});
        akCafe.setType("Cafe");

        akCafe.about();

        Place nileUni = new Place();
        nileUni.setAddress("Airport Road");
        nileUni.setName("Nile University of Nigeria");
        nileUni.about();
    }
}