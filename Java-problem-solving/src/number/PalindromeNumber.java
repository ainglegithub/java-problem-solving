package number;

public class PalindromeNumber {

    static void main() {
        int num = 121;
        System.out.println("IsPalindromeNumber :" + isPalindrome(num));
    }

    public static boolean isPalindrome(int n) {
        if (n < 0) return false; // Negative numbers are not palindromes (e.g., -121 != 121-)

        int original = n;
        int reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return original == reversed;
    }
}