package arrays;

import java.util.Arrays;

public class MoveZeros {

    static void main() {
        int[] arr = {1, 0, 2, 0, 3, 4, 0};
        int[] result = moveZerosUnordered(arr);
        System.out.println(Arrays.toString(result));
    }

    private static int[] moveZeros(int[] arr) {
        int k = 0; // Pointer for where the next non-zero should go

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }
        return arr;
    }

    private static int[] moveZerosUnordered(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 0) {
                arr[left] = arr[right];
                arr[right] = 0;
                right--;
            } else {
                left++;
            }
        }
        return arr;
    }

//    private static int[] moveZeros(int[] arr) {
//        int[] result = new int[arr.length]; // All elements default to 0
//        int index = 0;
//
//        for (int num : arr) {
//            if (num != 0) {
//                result[index++] = num;
//            }
//        }
//        return result;
//    }

//    private static int[] moveZeros(int[] arr) {
//        int length = arr.length;
//        int[] result = new int[length];
//        int index = 0;
//        for (int a : arr) {
//            if (a != 0) {
//                result[index++] = a;
//            }
//        }
//
//        while (length != result.length) {
//            result[index++] = 0;
//        }
//        return result;
//    }
}
