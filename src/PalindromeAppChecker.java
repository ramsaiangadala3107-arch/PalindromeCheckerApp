import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class PalindromeAppChecker {

    public static void main(String[] args) {


        String word = "malayalam";


        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();


        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);      // LIFO
            queue.add(ch);       // FIFO
        }

        boolean isPalindrome = true;


        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }


        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is Not a Palindrome");
        }
    }
}