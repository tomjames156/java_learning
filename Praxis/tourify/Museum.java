package tourify;

public class Museum extends Place{
    private int[] budget;

    public void setBudget(int[] budget){
        this.budget = budget;
    }

    public String getBudget(){
        return this.budget[0] + "-" + this.budget[1] + " naira";
    }

    public void about(){
        System.out.println(this.getName() + " is located in " + this.getAddress() + ". It costs about " + this.getBudget() + ". \n\tIt has an average rating of " + this.getRating() + " on Tourify.");
    }

    public static void main(){


    }
}