package tourify.java;

public class Restaurant extends Place{
    private String restType;
    private int[2] budget;

    public String getType(){
        return this.restType;
    } 

    public void setType(restType){
        this.restType = restType;
    }

    public String getBudget(){
        return this.budget[0] + "-" + this.budget[1] ;
    } 

    public void setBudget(budget){
        this.budget = budget;
    }

    public void about(){
        System.out.println(this.name + " is located in " + this.address + ". It is a " + this.restType + " restaurant and it costs about $" + this.getBudget() + " to eat there")
    }
}