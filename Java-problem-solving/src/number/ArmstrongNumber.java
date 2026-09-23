package number;

public class ArmstrongNumber {
    static void main() {
        int num = 153;
        System.out.println("ArmstrongNumber : " + isArmstrong(num));
    }

    public static boolean isArmstrong(int n) {
        if (n < 0) return false;

        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        return sum == original;
    }
}
