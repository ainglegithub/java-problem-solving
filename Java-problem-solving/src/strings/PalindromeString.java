package strings;

public class PalindromeString {

    static void main() {

        String str = "madam";
        //1
        String reverse = new StringBuffer(str).reverse().toString();
        if (str.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        //2
        int start = 0;
        int end = str.length() - 1;
        boolean isPalindrom = true;

        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrom = false;
                break;
            } else {
                start++;
                end--;
            }

        }
        if (isPalindrom) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
