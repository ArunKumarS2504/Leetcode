class searchPositin {
    public int searchInsert(int[] nums, int target) {
         int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
    public class Main {
        public static void main(String[] args) {
            Solution solution = new Solution();
    
            // Test cases
            int[] nums1 = {1, 3, 5, 6};
            int target1 = 5;
            System.out.println("Output: " + solution.searchInsert(nums1, target1)); 
            int[] nums2 = {1, 3, 5, 6};
            int target2 = 2;
            System.out.println("Output: " + solution.searchInsert(nums2, target2)); 
    
            int[] nums3 = {1, 3, 5, 6};
            int target3 = 7;
            System.out.println("Output: " + solution.searchInsert(nums3, target3)); // Expected Output: 4
    
            int[] nums4 = {1, 3, 5, 6};
            int target4 = 0;
            System.out.println("Output: " + solution.searchInsert(nums4, target4)); // Expected Output: 0
        }
    }
}