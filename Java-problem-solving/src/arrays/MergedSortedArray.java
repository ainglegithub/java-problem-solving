package arrays;

import java.util.Arrays;

public class MergedSortedArray {

    static void main() {

        int[] arr1 = {1, 3, 5, 6};
        int[] arr2 = {2, 4, 5};

        int[] result = mergeSortedArray(arr1, arr2);

        System.out.println("MergedSortedArray :" + Arrays.toString(result));
    }

    private static int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int[] mergeSortedArray = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                mergeSortedArray[k] = arr1[i];
                i++;
                k++;
            } else {
                mergeSortedArray[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < n1) {
            mergeSortedArray[k] = arr1[i];
            i++;
            k++;
        }

        while (j < n2) {
            mergeSortedArray[k] = arr2[j];
            j++;
            k++;
        }

        return mergeSortedArray;
    }
}
