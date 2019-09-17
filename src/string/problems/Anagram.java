package string.problems;

import java.util.Arrays;


public class Anagram {

    static boolean isAnagram(char[] string1, char[] string2) {
        int a1 = string1.length;
        int a2 = string2.length;

        if (a1 != a2)
            return false;
        Arrays.sort(string1);
        Arrays.sort(string2);
        for (int i = 0; i < a1; i++)
            if (string1 [i] != string2 [i])
                return false;

        return true;
    }

    public static void main(String[] args) {

        char string1[] = { 'A', 'R', 'M' ,'Y'};
        char string2[] = { 'M', 'A', 'R' ,'Y' };
        if (isAnagram(string1, string2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");
    }

}