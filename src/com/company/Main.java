package com.company;

public class Main {

    public static void main(String[] args) {
	// Think Java Exercise 6.6

    // String variables.
    String pileOfWord = "qUiibJo";
    String spellWord = "jiB";

    //If the condition returns true it will print the first line else will only be printed if it returns false.
    if (canSpell(pileOfWord, spellWord)){
        System.out.println("It's possible to spell: " + spellWord.toLowerCase());
    }else{
        System.out.println("It's not possible to spell that word!");
    }

    }

    public static boolean canSpell(String aPileOfWords, String aWordToSpell){

        // Strings converted to lowercase.
        String lowerCasePile = aPileOfWords.toLowerCase();
        String lowerCaseWord = aWordToSpell.toLowerCase();

        // The lowerCaseWord String is converted to an integer.
        int lowerCaseWordTotal = lowerCaseWord.length();

        // This "for" loop starts at index "1" which is "q" and then the inner loop checks if there is any matching letters to index "1" (also called a nested loop).
        for (int i = 0; i < lowerCaseWord.length(); i++) {

            // Inner loop starts at index 0 which is "j".
            for (int j = 0; j < lowerCasePile.length(); j++)

                // If the condition is true it will continue with.
                if (lowerCaseWord.charAt(i) == lowerCasePile.charAt(j)) {

                    // Using a substring to remove the letters that have been found and shows whats left of the pile.
                    lowerCasePile = lowerCasePile.substring(0, j) + lowerCasePile.substring(j + 1);
                    System.out.println("Letters left: " + lowerCasePile);

                    // This statement is used to determine if it will return true or false.
                    lowerCaseWordTotal = lowerCaseWordTotal - 1;
                    System.out.println("Letters missing: " + lowerCaseWordTotal);
                }
        }
        return lowerCaseWordTotal == 0;
    }
}
