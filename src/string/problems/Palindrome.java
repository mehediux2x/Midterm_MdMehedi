package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */



        String p1 = "MOM";
        String p2 = "DAD";
        String p3 = "MADAM";

        System.out.println(isPalindrome(p1));
        System.out.println(isPalindrome(p2));
        System.out.println(isPalindrome(p3));
    }

    static boolean isPalindrome(String word) {

        String actualWord = word.toLowerCase();
        String reverseWord = "";

        for (int i = actualWord.length() - 1; i>=0; i--){

            reverseWord = reverseWord + actualWord.charAt(i);
        }
        if (actualWord.equals(reverseWord)){
            return true;
        }
        else {
            return false;
        }

    }

}
