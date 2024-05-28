package tourify;

public final class Restaurant extends Place{
    private String restType;
    private int[] budget;

    public String getType(){
        return this.restType;
    } 

    public void setType(String restType){
        this.restType = restType;
    }

    public String getBudget(){
        return budget[0] + "-" + budget[1] ;
    } 

    public void setBudget(int[] budget){
        this.budget = budget;
    }

    public void about(){
        System.out.println(this.getName() + " is located in " + this.getAddress() + ". It is a " + this.restType + " restaurant and it costs about $" + this.getBudget() + " to eat there. \n\tIt has an average rating of " + this.getRating() + " on Tourify.");
    }

    public static void main(String[] args){

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

        System.out.println(blueCabana.getBudget());
    }
}