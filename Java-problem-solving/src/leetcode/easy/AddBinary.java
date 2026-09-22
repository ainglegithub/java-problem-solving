package leetcode.easy;

public class AddBinary {

    //    Example 1:
//    Input: a = "11", b = "1"
//    Output: "100"
//    Example 2:
//    Input: a = "1010", b = "1011"
//    Output: "10101"
    static void main() {
        String a = "1010";
        String b = "1011";

        String result = addBinary(a, b);
        System.out.println("AddBinary :" + result);
    }

    private static String addBinary(String a, String b) {
        if (a == null || b == null || a.isEmpty() || b.isEmpty()) {
            return "";
        }
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder str = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            if (i >= 0) {
                sum = sum + a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum = sum + b.charAt(j) - '0';
                j--;
            }
            str.append(sum % 2);
            carry = sum / 2;

        }

        return str.reverse().toString();
    }
}
