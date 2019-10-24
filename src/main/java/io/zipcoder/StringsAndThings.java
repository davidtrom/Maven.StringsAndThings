package io.zipcoder;

import java.util.HashMap;
import java.util.Map;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * @author tariq
 */
public class StringsAndThings {


    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        int counter = 0;
        String[] inputArray = input.split(" ");
        for (String s : inputArray)     //for (i=0; i<
        {
            //int lastLetter = s.length()-1;
            char lastLetter = s.charAt(s.length() - 1);
            if (lastLetter == 'y' || lastLetter == 'z') {
                counter++;
            }
        }
        return counter;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove) {
        //String[] baseArray = base.split();
        String stringRemoved = base.replace(remove, "");

        return stringRemoved;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input) {
        /*int counterIs = 0;
        int counterNot = 0;

        String[] inputArray = input.split(" ");
        for (int i = 0; i < inputArray.length; i++) {
            //System.out.println(inputArray);
            if (inputArray[i].matches("is")) {
                counterIs++;
            } else if (inputArray[i].matches("not")) {
                counterNot++;
            }
        }
            Boolean trueOrNot;
            if (counterIs == counterNot) {
                trueOrNot = true;
            } else {
                trueOrNot = false;
            }*/


        int counterIs = 0;
        int counterNot = 0;
        char[] charArray = input.toCharArray();
        //int length = charArray.length;



            //public void findI ()

            for (int i = 0; i < charArray.length; i++)
        {
            if (charArray[i] == 's' && charArray[i-1] == ('i')) {
                counterIs++;
            }
            else if (charArray[i] == ('t') && charArray[i-1] == ('o') && charArray[i- 2] == ('n')) {
                counterNot++;
            }
        }
        //System.out.println(counterIs);
          //  System.out.println(counterNot);
        Boolean trueOrNot;
        if (counterIs == counterNot) {
            trueOrNot = true;
        } else {
            trueOrNot = false;
        }return trueOrNot;
        }





/**
 * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
 * Return true if all the g's in the given string are happy.
 * example : gHappy("xxggxx") // Should return  true
 * gHappy("xxgxx") // Should return  false
 * gHappy("xxggyygxx") // Should return  false
 */
public Boolean gIsHappy(String input) {


    char[] inputArray = input.toCharArray();
    Boolean gBack;
    Boolean gForward;
    Boolean gHappy = false;


    for (int i = 0; i < inputArray.length; i++) {
        if (inputArray[i] == 'g' && inputArray[i - 1] == 'g') {
            gHappy = true;
        } else if (inputArray[i] == 'g' && inputArray[i + 1] == 'g') {
            gHappy = true;
        }
        else if (inputArray[i] == 'g')
        {
            gHappy = false;
        }
    }
    return gHappy;
}



/**
 * We'll say that a "triple" in a string is a char appearing three times in a row.
 * Return the number of triples in the given string. The triples may overlap.
 * example :  countTriple("abcXXXabc") // Should return 1
 *            countTriple("xxxabyyyycd") // Should return 3
 *            countTriple("a") // Should return 0
 */
public Integer countTriple(String input){

    int counter= 0;
    String allLowers = input.toLowerCase();
    char[] charArray = input.toCharArray();
    //int length = charArray.length;
  for (int i = 0; i < charArray.length-1; i++)
    {
        //char checkChar = charArray[i];
        if (charArray[i] == charArray[i+1] && charArray[i] == charArray[i+2] )
        {
            counter++;
        }
    }
        return counter;
        }
}


