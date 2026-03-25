public class PalindromeAppChecker {

    public static void main(String[] args) {


        String word = "level";


        String reversed = "";


        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }


        if (word.equals(reversed)) {
            System.out.println("The string " + word + " is a Palindrome");
        } else {
            System.out.println("The string " + word + " is Not a Palindrome");
        }
    }
}