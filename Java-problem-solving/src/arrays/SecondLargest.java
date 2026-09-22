package arrays;

import java.util.Arrays;

public class SecondLargest {

    static void main() {
        int[] arr = {26, 1, 4, 26, 9, 24, 23, 26};
        int large = 0;
        int secondLarge = 0;
        //1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            } else if (arr[i] > secondLarge && arr[i] < large) {
                secondLarge = arr[i];
            }
        }
        System.out.println("Large: " + large);
        System.out.println("SecondLarge: " + secondLarge);

        //2
        Arrays.sort(arr);
        large = arr[arr.length - 1];
        secondLarge = Integer.MIN_VALUE;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < large) {
                secondLarge = arr[i];
                break;
            }
        }
        System.out.println("Large: " + large);
        System.out.println("SecondLarge: " + secondLarge);

    }
}
