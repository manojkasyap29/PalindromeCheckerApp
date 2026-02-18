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
    }
}