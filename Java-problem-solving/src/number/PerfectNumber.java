package number;

public class PerfectNumber {
    static void main() {
        int num = 6;
        System.out.println("IsPerfect: " + isPerfect(num));
    }

    public static boolean isPerfect(int n) {
        if (n <= 1) return false;

        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i * i != n) { // Add corresponding divisor if not a square root
                    sum += n / i;
                }
            }
        }
        return sum == n;
    }
}
