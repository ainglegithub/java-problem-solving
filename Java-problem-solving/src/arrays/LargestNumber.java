package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LargestNumber {

    static void main() {
        int[] arr = {26, 1, 4, 26, 9, 24, 23, 26};
        //1
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest : " + largest);

        //2
        Arrays.sort(arr);
        System.out.println("Largest : " + arr[arr.length -1]);

    }

}
