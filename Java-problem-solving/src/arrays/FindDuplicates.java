package arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    static void main() {
        int[] arr = {26, 1, 1, 2, 3, 3, 4, 26, 9, 24, 23, 26};

        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int a : arr) {
            if (!unique.add(a)) {
                duplicates.add(a);
            }

        }
        System.out.println("Duplicates : " + duplicates);
    }
}
