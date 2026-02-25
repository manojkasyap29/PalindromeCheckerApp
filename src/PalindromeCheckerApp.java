import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        //UC1:
        System.out.println("Palindrome Checker App");
        System.out.println("UC1: Version: 1.0");
        System.out.println("-----------------------------");

        //UC2:
        String input = "madam";
        if (input.equals("madam")) {
            System.out.println("UC2: madam is a palindrome (Hardcoded)");
        }

        //UC3:
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        if (input.equals(reversed)) {
            System.out.println("UC3: " + input + " is a palindrome (String Reverse)");
        }

        //UC4:
        char[] charArray = input.toCharArray();
        boolean isPalindrome = true;
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            if (charArray[i] != charArray[j]) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("UC4: Palindrome check: " + isPalindrome + " (Char Array)");

        //UC5:
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.pop());
        }

        System.out.println("UC5: " + input.equals(res.toString()) + " (Stack)");

        //UC:6
        Queue<Character> q = new LinkedList<>();
        Stack<Character> s = new Stack<>();
        for (char c : input.toCharArray()) {
            q.add(c);
            s.push(c);
        }
        boolean isUc6Palindrome = true;
        while (!q.isEmpty()) {
            if (q.remove() != s.pop()) {
                isUc6Palindrome = false;
                break;
            }
        }
        System.out.println("UC6: Palindrome check: " + isUc6Palindrome + " (Queue + Stack)");

        //UC:7
        Deque<Character> deque = new LinkedList<>();
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        boolean isDequePalindrome = true;
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isDequePalindrome = false;
                break;
            }
        }
        System.out.println("UC7: Palindrome check: " + isDequePalindrome + " (Deque)");

        // UC8:8
        ListNode head = new ListNode(input.charAt(0));
        ListNode currentUC8 = head;
        for (int i = 1; i < input.length(); i++) {
            currentUC8.next = new ListNode(input.charAt(i));
            currentUC8 = currentUC8.next;
        }
        System.out.println("UC8: Singly Linked List created for node traversal");

        // UC9: Recursive Palindrome Checker
        boolean isUc9Palindrome = isRecursive(input, 0, input.length() - 1);
        System.out.println("UC9: Recursive check: " + isUc9Palindrome);
    }

    static class ListNode {
        char val;
        ListNode next;

        ListNode(char val) {
            this.val = val;
        }
    }

    // UC9 Helper: Must be INSIDE the class, but OUTSIDE main
    public static boolean isRecursive(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isRecursive(s, start + 1, end - 1);
    }
}


