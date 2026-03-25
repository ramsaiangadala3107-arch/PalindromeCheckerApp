import java.util.*;

public class PalindromeAppChecker {


    public static boolean reverseMethod(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return word.equals(reversed);
    }


    public static boolean stackMethod(String word) {
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


    public static boolean dequeMethod(String word) {
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

    public static void main(String[] args) {

        String word = "madam";


        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(word);
        long end1 = System.nanoTime();


        long start2 = System.nanoTime();
        boolean result2 = stackMethod(word);
        long end2 = System.nanoTime();


        long start3 = System.nanoTime();
        boolean result3 = dequeMethod(word);
        long end3 = System.nanoTime();


        System.out.println("Reverse Method: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Method: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Deque Method: " + result3 +
                " | Time: " + (end3 - start3) + " ns");
    }
}