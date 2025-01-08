class Solution8 {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check if the left portion is sorted
            if (nums[start] <= nums[mid]) {
                // Target is within the sorted left portion
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { 
                // Right portion is sorted
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5, 1, 3};
        int target = 5;
        Solution8 solution = new Solution8();
        System.out.println(solution.search(nums, target)); // Expected output: 0
    }
}


//The time complexity : O(log n)

//The space complexity : O(1)

// This solution performs a binary search on a rotated sorted array to find the target value. It determines whether the target lies in the sorted left or right portion of the array and adjusts the search range accordingly.

// Time Complexity: O(log n) because the search space is halved in each iteration.
// Space Complexity: O(1) since no additional space is used apart from a few pointers.





