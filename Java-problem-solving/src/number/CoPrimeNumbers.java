package number;

public class CoPrimeNumbers {

    static void main() {
        System.out.println("AreCoPrime :" + areCoPrime(2,9));
    }
    // Euclidean Algorithm for GCD
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static boolean areCoPrime(int a, int b) {
        return gcd(a, b) == 1;
    }
}