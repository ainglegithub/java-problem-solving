package number;

public class BasicNumberTypes {
    static void main() {
        int num = 7;

        System.out.println("IsEven: " + isEven(num));
        System.out.println("IsOdd: " + isOdd(num));
        System.out.println("IsComposite: " + isComposite(num));
    }

    // Even Check
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Odd Check
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    // Composite Check (Number > 1 that is NOT prime)
    public static boolean isComposite(int n) {
        if (n <= 3) return false; // 0, 1, 2, 3 are not composite
        if (n % 2 == 0 || n % 3 == 0) return true;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return true;
            }
        }
        return false;
    }
}
