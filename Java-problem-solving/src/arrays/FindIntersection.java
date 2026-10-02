package arrays;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersection {

    static void main() {

        int[] arr1 = {1, 3, 5, 6};
        int[] arr2 = {2, 4, 5, 3, 1};

        int[] result = findIntersection(arr1, arr2);

        System.out.println("Intersection :" + Arrays.toString(result));
    }

    private static int[] findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> intersection = new LinkedHashSet<>();
        int[] arr = new int[5];
        int index = 0;
        for (int value : arr1) {
            set.add(value);
        }

        for (int value : arr2) {
            if (set.contains(value)) {
                intersection.add(value);
                arr[index] = value;
                index++;
            }
        }
        //return arr;
        index = 0;
        int[] result = new int[intersection.size()];
        for (int value : intersection) {
            result[index++] = value;
        }
        return result;
    }
}
