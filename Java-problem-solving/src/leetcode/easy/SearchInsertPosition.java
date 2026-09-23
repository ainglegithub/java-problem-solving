package leetcode.easy;

//Input: nums = [1,3,5,6], target = 5
//Output: 2
public class SearchInsertPosition {


    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};
        int target = 6;
        int result = searchInsert(nums, target);
        System.out.println("SearchInsert: " + result);
    }

    private static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
            if (nums[mid] < target) {
                // Target is on the right side
                left = mid + 1;
            }
        }
        return left;
    }


//
//    public static int searchInsert(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] >= target){
//                return i;
//            }
//        }
//        return nums.length;
//    }

}
