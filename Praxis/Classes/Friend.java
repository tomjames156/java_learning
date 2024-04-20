public class Friend{

    String fname;
    String lname;
    int age;
    String firstMet = "Nile University";
    boolean isMarried = false;
    final String[] pronouns = {"They", "Them", "They're"};

    public Friend(String fName, String lName, int currAge, String firstMeet, boolean isMarriedYet){
        fname = fName;
        lname = lName;
        age = currAge;
        firstMet = firstMeet;
        isMarried = isMarriedYet;
    }

    static void intro(String fname){
        System.out.println("Hi my name is " + fname + '.');
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
        intro(Faridah.fname);
        intro(Faridah.fname, Faridah.lname);
        Faridah.intro(Faridah.fname, Faridah.lname, Faridah.age);

        Friend Destiny = new Friend("Destiny", "Daniel", 19, "University", true);
        // Friend Destiny = new Friend();
        // Destiny.fname = "Destiny";
        // Destiny.lname = "Daniel";
        // Destiny.age = 19;
        // Destiny.isMarried = true;
        // Destiny.pronouns = new String[] {"He", "Him", "He's"};

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