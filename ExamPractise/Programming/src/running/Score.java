package running;

import java.util.*;

public class Score{

    /**
     * desc - a method that returns the letter grade equivalent of the numeric grade given to it
     * @return A/B/C/D/F (char)
     * @param score (int)
     */
    public static char grade(int score){
        if(score > 70){
            return 'A';
        }else if(score > 60){
            return 'B';
        }else if(score > 50){
            return 'C';
        }else if(score > 40){
            return 'D';
        }else{
            return 'F';
        }
    }


    public static void main(String[] args){
        // create list for scores
        List<Integer> scores = new ArrayList<Integer>();

        // create list for grades
        List<Character> grades = new ArrayList<Character>();

        // start loop from here till it reaches 10 scores and is terminated by -1
        Scanner numScanner = new Scanner(System.in);
        while(scores.size() < 5){

            // get input of score
            System.out.print("\nGrade: ");
            int scoreInput = numScanner.nextInt();
            
            if(scoreInput == -1){
                System.out.println("Successfully exited program");
                break;
            }

            // check if score is btw 1 - 100
            if(scoreInput < 1 || scoreInput > 100){
                System.out.println("Invalid Score");
                continue;
            }

            // store it in scores list
            scores.add(scoreInput);

            // get grade for score
            char grade = Score.grade(scoreInput);

            // store grade in grades list
            grades.add(grade);
        }

        numScanner.close();
        
        // print score - grade
        System.out.println("Printing grades for " + grades.size() + " grades supplied");

        for(int i = 0; i < grades.size(); i++){
            System.out.println(scores.get(i) + " - " + grades.get(i));
        }

    }
}