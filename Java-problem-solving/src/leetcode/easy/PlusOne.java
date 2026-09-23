package leetcode.easy;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {

        // int[] nums = {9, 9, 9};
        int[] nums = {0};
        int[] result = plusOne(nums);
        System.out.println("PlusOne: " + Arrays.toString(result));
    }

    private static int[] plusOne(int[] nums) {

        if (nums == null || nums.length < 0) {
            return new int[]{};
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }

        int[] result = new int[nums.length + 1];
        result[0] = 1;
        return result;
    }

}
