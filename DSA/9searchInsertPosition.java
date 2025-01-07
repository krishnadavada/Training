class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;              // Starting index
        int high = nums.length - 1; // Ending index

        while (low <= high) {
            int mid = low + (high - low) / 2; // Avoid overflow by using this formula

            if (nums[mid] == target) { // If target is found
                return mid;
            }

            if (nums[mid] < target) { // Target lies on the right half
                low = mid + 1;
            } else { // Target lies on the left half
                high = mid - 1;
            }
        }

        // If target is not found, 'low' is the position where it should be inserted
        return low;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 6};
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;
        int target4 = 0;

        System.out.println("Position of " + target1 + ": " + solution.searchInsert(nums, target1)); // Output: 2
        System.out.println("Position of " + target2 + ": " + solution.searchInsert(nums, target2)); // Output: 1
        System.out.println("Position of " + target3 + ": " + solution.searchInsert(nums, target3)); // Output: 4
        System.out.println("Position of " + target4 + ": " + solution.searchInsert(nums, target4)); // Output: 0
    }
}

 //time complexity : O(log n)
 //space complexity : O(1)

// The solution uses a binary search to find the target value or determine the index where the target should be inserted in a sorted array. If the target is not found, it returns the index where the target can be inserted while maintaining the order.

// Time Complexity: O(log n) as the array is halved in each iteration of the binary search.
// Space Complexity: O(1) because only a constant amount of extra space is used for the pointers.





