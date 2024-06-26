package mypackage;

public class Friend{

    public String fname;
    public String lname;
    public int age;
    public String firstMet = "Nile University";
    public boolean isMarried = false;
    public final String[] pronouns = {"They", "Them", "They're"};

    // constructor
    public Friend(String fname, String _lname, int age, String _firstMet, boolean _isMarried){
        this.fname = fname;
        lname = _lname;
        this.age = age;
        firstMet = _firstMet;
        isMarried = _isMarried;
    }

    public void intro(){
        System.out.println("Hi my name is " + this.fname + ".");
    }

    static void intro(String fname, String lname){
        System.out.println("Hi my name is " + fname + " " + lname + '.');
    }

    public void intro(String fname, String lname, int age){
        System.out.println("Hi my name is " + fname + " " + lname + ". I'm " + age + " years old.");
    }


    public static void main(String[] args){

        Friend Faridah = new Friend("Faridah", "Okeniyi", 20, "Primary School", false);
        // Faridah.fname = "Faridah";
        // Faridah.lname = "Okeniyi";
        // Faridah.age = 20;
        // Faridah.firstMet = "Primary School";
        Faridah.intro();
        intro(Faridah.fname, Faridah.lname);
        Faridah.intro(Faridah.fname, Faridah.lname, Faridah.age);

        Friend Destiny = new Friend("Destiny", "Daniel", 19, "University", true);
        // Friend Destiny = new Friend();
        // Destiny.fname = "Destiny";
        // Destiny.lname = "Daniel";
        // Destiny.age = 19;
        // Destiny.isMarried = true;
        // Destiny.pronouns = new String[] {"He", "Him", "He's"};

        System.out.println(Faridah.fname.indexOf(0x69));
        System.out.println(Faridah.fname.concat("-na"));

        Friend[] friends = {Faridah, Destiny};

        for(Friend friend : friends){
            System.out.print("I have a friend named " + friend.fname + ". " + friend.fname + " is " + friend.age + " years old. We met in " + friend.firstMet + ".\n\t" + friend.pronouns[2]);
            if(friend.isMarried){
                System.out.println(" married.");
            }else{ 
                System.out.println(" not yet married.");
            }
        }
    }
}