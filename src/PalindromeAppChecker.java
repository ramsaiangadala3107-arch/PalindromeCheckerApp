class PalindromeChecker {


    public boolean checkPalindrome(String word) {

        String reversed = "";


        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }


        if (word.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }
}


public class PalindromeAppChecker {

    public static void main(String[] args) {

        String word = "malayalam";


        PalindromeChecker checker = new PalindromeChecker();


        boolean result = checker.checkPalindrome(word);


        if (result) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }
    }
}