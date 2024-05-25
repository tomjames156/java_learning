import java.util.*;
import java.io.*;

public class JPITests{

    public static void main(String[] args){

        try{
            File myFriends = new File("friends.txt");
            System.out.println(myFriends.canWrite());

            System.out.println("Absolute Path: " + myFriends.getAbsolutePath());

            if(myFriends.exists()){
                System.out.println("File Found");
            }else{
                System.out.println("File Not Found");
            }


            FileReader myReader = new FileReader(myFriends);
            BufferedReader buff = new BufferedReader(myReader);

            int i;

            while((i = buff.read()) != -1){
                System.out.print((char)i);
            }

            buff.close();
            System.out.println("\n\tFinished Reading");
        }catch (Exception e){
            System.out.println(e);
        }
    
    }
}