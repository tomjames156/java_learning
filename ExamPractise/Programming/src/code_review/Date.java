package code_review;

import java.util.*;

public class Date {
    public static int myBdayYear = 2005;

    public static int LONG_WORD_LENGTH = 5;
    public static String longestWord;

    public static void countLongWords(List<String> words) {
        // bad method name, unclear variable n
        // poor use of whitespace, inconsistent indentation, no use of curly braces
        // prints out result instead of returning it
        // uses global variables for computation
        // no comments or specification
        // repitition in different ways for the word length
        int n = 0;
        longestWord = "";
        for (String word: words) {
            if (word.length() > LONG_WORD_LENGTH) ++n;
            if (word.length() > longestWord.length()) longestWord = word;
            }
            System.out.println(n);
    }


    /**
     * A method that gets the longest word in a collection of words
     * @param words a collection of words as a list
     * @return the longest word in the collection
     */
    public static String getLongestWord(List<String> words){
        String longest = "";

        for(String word : words){
            if(word.length() > longest.length()){
                longest = word;
            }
        }

        return longest;
    }

    public static boolean smellyLeap(int y) {
        // bad variable name tmp and the method name itself even the parameter name
        // poor styling convention or no styling convention (no use of curly braces and inconsistent indentation)
        // bad comments R1, R2, R3, R4
        // assumes that the year is going to be a 4 digit number
        String tmp = String.valueOf(y);
        if (tmp.charAt(2) == '1' || tmp.charAt(2) == '3' || tmp.charAt(2) == 5 || tmp.charAt(2) == '7' || tmp.charAt(2) == '9') {
        if (tmp.charAt(3)=='2'||tmp.charAt(3)=='6') return true; /*R1*/
        else
        return false; /*R2*/
        }else{
        if (tmp.charAt(2) == '0' && tmp.charAt(3) == '0') {
        return false; /*R3*/
        }
        if (tmp.charAt(3)=='0'||tmp.charAt(3)=='4'||tmp.charAt(3)=='8')return true; /*R4*/
        }
        return false; /*R5*/
       }

    /**
     * A method that checks if a year is a leap year
     * @param year (integer)
     * @return boolean (true / false)
     */
    public static boolean isLeapYear(final int year){
        myBdayYear -= 1; // modifying the global variable
        int yearCopy = year;
        
        // check if year is divisible by 4
        if(yearCopy % 4 == 0){
            
            // for a century, check if year is divisible by 400
            if((yearCopy % 100 == 0) && (yearCopy % 400 != 0)){
                return false;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
    
    public static int smellyDayOfYear(int month, int dayOfMonth, int year) {
        // Smelly code
        // DRY (Do not Repeat Yourself)
        // Does not Fail Fast Does not check leap years & Does not check the day of month given whether its within
        // Comments Where Needed
        // Reassigns the method parameter dayOfMonth , final keyword should be used to declare method parameters to prevent reassignment

        if (month == 2) {
            dayOfMonth += 31;
        } else if (month == 3) {
            dayOfMonth += 59;
        } else if (month == 4) {
            dayOfMonth += 90;
        } else if (month == 5) {
            dayOfMonth += 31 + 28 + 31 + 30;
        } else if (month == 6) {
            dayOfMonth += 31 + 28 + 31 + 30 + 31;
        } else if (month == 7) {
            dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30;
        } else if (month == 8) {
            dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31;
        } else if (month == 9) {
            dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
        } else if (month == 10) {
            dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
        } else if (month == 11) {
            dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
        } else if (month == 12) {
            dayOfMonth += 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 31;
        }

        return dayOfMonth;
    }


    /**
     * A function that caclulates the day of the year given the month, current day of the mont and year
     * @param month - integer from 1 - 12 (Jan to Dec)
     * @param dayOfMonth - integer current day of the month 
     * @param year 
     * @return n dayOfTheYear - day of the year value (n / 365)
     */
    public static int dayOfTheYear(final int month, final int dayOfMonth, final int year){
        final int[] MONTH_LENGTHS = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // number of days in every month of the year

        int dayOfTheYear = dayOfMonth;

        if(dayOfMonth > MONTH_LENGTHS[month - 1]){
            System.out.println("Invalid day of the month");
            return -1; 
        }

        // loop from start of days of year array to the beginning of the month inputed 
        for(int i = 0; i < month - 1; i++){
            dayOfTheYear += MONTH_LENGTHS[i];
        }

        return dayOfTheYear;
    }

    public static void main(String[] args){
        
        System.out.println("Today is the Day " + Date.smellyDayOfYear(5, 3, 2025) + " of 2025.");

        System.out.println("Today is the Day " + Date.dayOfTheYear(2, 28, 2025) + " of 2025.");

        Scanner yearScanner = new Scanner(System.in);
        System.out.println("Enter a year to check if it's a leap year");
        System.out.print("> ");
        int testYear = yearScanner.nextInt();
        yearScanner.close();

        if(Date.isLeapYear(myBdayYear)){
            System.out.println("The year " + testYear + " is a leap year");
        }else{
            System.out.println("The year " + myBdayYear + " is not a leap year"); // returns an answer with the year off by one year
        }
        
        List<String> words = new ArrayList<String>();
        words.add("Hi,");
        words.add("my");
        words.add("namely");
        words.add("is");
        words.add("Rastafarian");

        countLongWords(words);
        System.out.println(longestWord);
        System.out.println(getLongestWord(words));
    }
}
