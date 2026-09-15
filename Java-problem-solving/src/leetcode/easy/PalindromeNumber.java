package leetcode.easy;

import java.util.Arrays;

public class PalindromeNumber {

    public static void main(String[] args) {

        int num = 12521;
        boolean result = isPalindrome(num);
        System.out.println("IsPalindrome: " + result);
    }

    private static boolean isPalindrome(int num) {
        String str = num + "";
        int start = 0;
        int end = str.length() - 1;

        for (int i = start; start <= end; i++) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }

        }
        return true;
    }

//    private static boolean isPalindrome(int num) {
//        int original = num;
//        int reverse = 0;
//        while (num > 0) {
//            int digit = num % 10;    // get last digit
//            reverse = reverse * 10 + digit;
//            //System.out.println(reverse);
//            num = num / 10;  // remove last digit
//        }
//
//        if (reverse == original) {
//            return true;
//        }
//        return false;
//    }

}
