import java.util.*;


public class FacultyDinner{

    public static void main(String[] args){

        Guest tomi = new Guest("Tomisin");
        Guest naza = new Guest("Chinaza");
        Guest hauwa = new Guest("Hauwa");
        Guest maryam = new Guest("Arinola");

        List<Guest> guestList = new ArrayList<Guest>();
        List<Guest> judgesList = new ArrayList<Guest>();
        guestList.add(tomi);
        guestList.add(naza);
        guestList.add(hauwa);
        guestList.add(maryam);
        guestList.add(maryam);

        System.out.println("Here's a list of invited guests for the faculty dinner");
        for(int i = 0; i < guestList.size(); i++){
            System.out.println("\t" + guestList.get(i).name);
        }

        Guest chuks = new Guest("Chukwudubem");
        int checkStatus = guestList.indexOf(chuks);
        if(checkStatus == -1){
            System.out.println("\n" + chuks.name + " is not on the guest list");
        }

        Guest nshii = new Guest("Nshii");
        guestList.add(nshii);

        System.out.println("Here's a list of invited guests for the faculty dinner");
        for(int i = 0; i < guestList.size(); i++){
            System.out.println("\t" + guestList.get(i).name);
        }

        System.out.println(judgesList.isEmpty());

        Set<Integer> evenNumbers = new HashSet<Integer>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        evenNumbers.add(8);

        Set<Integer> singleDigitNumbers = new HashSet<Integer>();
        singleDigitNumbers.add(0);
        singleDigitNumbers.add(1);
        singleDigitNumbers.add(2);
        singleDigitNumbers.add(3);
        singleDigitNumbers.add(4);
        singleDigitNumbers.add(5);
        singleDigitNumbers.add(6);
        singleDigitNumbers.add(7);
        singleDigitNumbers.add(8);
        singleDigitNumbers.add(9);

        System.out.println(singleDigitNumbers.size());
        System.out.println(evenNumbers.size());
        System.out.println(singleDigitNumbers.containsAll(evenNumbers));
        singleDigitNumbers.removeAll(evenNumbers);
        System.out.println(singleDigitNumbers.size());
        System.out.println(singleDigitNumbers.isEmpty());

        Set random = new HashSet();
        random.add(4);
        random.add("Izzy");
        random.add("Illions");
        System.out.println(random.size()); // sets can have different data types stored in them

        Map<Integer, String> students = new HashMap<Integer, String>();
        students.put(20220398, "Tomisin");
        students.put(20220399, "Esi");
        students.put(20220400, "Chinaza");

        // for(int x = 0; x < students.size(); x++){
        //     System.out.println(students.get())
        // }

        String[] myNumbers = new String[] {"Ja", "Je", "Jo"};
        List<String> myList = Arrays.asList(myNumbers);
        System.out.println(myList.get(1));
        System.out.println("The list is: " + myList);

        Integer[] myGrades = new Integer[] {95, 98, 93, 92};
        List<Integer> myGradesList = Arrays.asList(myGrades);
        // myGradesList.add(88); // cannot add any new elements - fixed size
        System.out.println("A list of my best grades this semester: " + myGradesList);

        students.remove(20220400);

        System.out.println(students.size());
    }
}