public class PalindromeAppChecker {

    public static void main(String[] args) {

        // Original string with spaces and mixed case
        String word = "Madam In Eden Im Adam";

        // Normalize string: remove spaces and convert to lowercase
        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        // Reverse the normalized string
        String reversed = "";
        for (int i = normalized.length() - 1; i >= 0; i--) {
            reversed = reversed + normalized.charAt(i);
        }

        // Compare normalized string with reversed string
        if (normalized.equals(reversed)) {
            System.out.println("\"" + word + "\" is a Palindrome (ignoring spaces and case)");
        } else {
            System.out.println("\"" + word + "\" is Not a Palindrome");
        }
    }
}