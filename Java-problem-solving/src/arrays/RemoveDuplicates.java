package arrays;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

    static void main() {
        int[] arr = {26, 1, 1, 2, 3, 3, 4, 26, 9, 24, 23, 26};

        LinkedHashSet<Integer> unique = new LinkedHashSet<>();
        for (int a : arr) {
            unique.add(a);
        }

        System.out.println("unique : " + unique);
    }
}
