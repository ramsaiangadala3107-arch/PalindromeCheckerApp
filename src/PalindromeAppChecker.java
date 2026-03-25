import java.util.*;


interface PalindromeStrategy {
    boolean checkPalindrome(String word);
}


class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return word.equals(reversed);
    }
}


class DequeStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String word) {
        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }
}


public class PalindromeAppChecker {

    public static void main(String[] args) {

        String word = "malayalam";


        PalindromeStrategy strategy;


        strategy = new StackStrategy();


        boolean result = strategy.checkPalindrome(word);

        if (result) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }
    }
}