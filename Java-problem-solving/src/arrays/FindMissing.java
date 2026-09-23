package arrays;

public class FindMissing {

    static void main() {

        int[] arr = {1, 2, 3, 4, 6};
        int num = findMissing(arr);
        System.out.println("Missing Number: " + num);

    }

//    private static int findMissing(int[] arr) {
//        int n = arr.length + 1;
//        int sum = n * (n + 1) / 2;
//        int total = 0;
//
//        for (int i : arr) {
//            total += i;
//        }
//        return sum - total;
//    }

    private static int findMissing(int[] arr) {
        int n = arr.length + 1;
        int xorAll = 0;
        int xorArr = 0;

        for (int i = 0; i <= n; i++) {
            xorAll ^= i;
        }

        for (int i : arr) {
            xorArr ^= i;
        }

        return xorAll - xorArr;
    }
}
