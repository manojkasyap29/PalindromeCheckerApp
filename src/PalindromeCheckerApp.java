public class PalindromeCheckerApp {
    public static void main(String[] args) {

        System.out.println("Palindrome Checker App");
        System.out.println("UC1: Version: 1.0");
        System.out.println("-----------------------------");


        String input = "madam";
        if (input.equals("madam")) {
            System.out.println("UC2: madam is a palindrome (Hardcoded)");
        }

        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        if (input.equals(reversed)) {
            System.out.println("UC3: " + input + " is a palindrome (String Reverse)");
        }
    }
}