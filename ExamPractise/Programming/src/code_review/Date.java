package code_review;

public class Date {
    
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
    }
}
