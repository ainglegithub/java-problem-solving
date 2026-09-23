package leetcode.easy;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 3, 4};
        int result = removeDuplicates(nums);
        System.out.println("Unique count: " + result);
    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
