public class PhraseOMatic{

    public static void main(String[] args){

        // WordLists
        String[] wordList1 = {"eco-friendly", "woke", "Giga Chad", "based", "gym-bro"};String[] wordList2 = {"sigma", "cap", "rizz", "TikTok", "grah", "GRWN", "thrifted"};
        String[] wordList3 = {"Stanley cup", "Shein", "alté", "santi", "tech", "OOTD"};

        // Get lengths of the wordlists
        int l1 = wordList1.length;
        int l2 = wordList2.length;
        int l3 = wordList3.length;

        // Get random indexes to generate phrases
        int rand1 = (int) (Math.random() * l1);
        int rand2 = (int) (Math.random() * l2);
        int rand3 = (int) (Math.random() * l3);

        // Get new phrase
        String phrase = wordList1[rand1] + " " + wordList2[rand2] + " "  + wordList3[rand3];

        // Print complete phrase with the words from the 3 wordlists
        System.out.print(phrase);
    }
}