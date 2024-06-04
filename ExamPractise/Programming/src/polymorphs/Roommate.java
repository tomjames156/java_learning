package polymorphs;

public class Roommate {
    String fname;
    String lname;

    public Roommate(String _fname, String _lname){
        fname = _fname;
        lname = _lname;
    }

    public void intro(){
        System.out.println("Hi my name is " + fname);
    }

    // different number of inputs

    public void intro(String nickname){
        System.out.println("Hi my name is " + fname + " but my friends call me " + nickname);
    }

    // different input types

    public String intro(boolean fullName){
        if(fullName){
            return "Hi my name is " + lname + " " + fname;
        }else{
           return "Hi my name is " + fname;
        }
    }

    public void intro(boolean fullName, String nickname){
        if(fullName){
            System.out.println("Hi my name is " + fname + " " + lname + " but I go by " + nickname);
        }else{
            System.out.println("Hi my name is " + fname + " but I go by " + nickname);
        }
    }
    
    public void intro(String nickname, boolean fullName){
        if(fullName){
            System.out.println("Hi my name is " + nickname + " but my full name is " + fname + " " + lname);
        }else{
            System.out.println("Hi my name is " + nickname + " but my full name is " + fname);
        }
    }

    public static void main(String[] args){

        Roommate ayo = new Roommate("Ayo", "Awe");
        ayo.intro();
        ayo.intro("AY");
        System.out.println(ayo.intro(true));
        ayo.intro(true, "A-Y");
        ayo.intro("AYY", false);
    }
}
