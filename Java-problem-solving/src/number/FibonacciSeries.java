package number;

public class FibonacciSeries {

    static void main() {
        int num = 5;
        printFibonacci(num);
    }

    public static void printFibonacci(int count) {
        if (count <= 0) return;

        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= count; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }
}
