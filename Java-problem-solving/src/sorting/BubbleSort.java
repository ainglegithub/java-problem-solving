package sorting;

import java.util.Arrays;

public class BubbleSort {

    static void main() {

        int[] arr = {2, 5, 1, 6, 4, 8, 9};
        arr = bubbleSort(arr);

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

//    private static int[] bubbleSort(int[] arr) {
//        int l = arr.length;
//        for (int i = 0; i < l - 1; i++) {
//
//            for (int j = 0; j < l - 1 - i; j++) {
//                // 2, 5, 1
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//
//        }
//        return arr;
//    }

    private static int[] bubbleSort(int[] arr) {
        int l = arr.length;
        boolean swapped;

        for (int i = 0; i < l - 1; i++) {
            swapped = false;

            for (int j = 0; j < l - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in inner loop, array is sorted
            if (!swapped) break;
        }
        return arr;
    }
}
