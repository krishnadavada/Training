import java.util.*;

class Solution4 {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);  // Sort the array to use two pointers approach

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first element in the triplet
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;  // Left pointer starts just after the current element
            int right = nums.length - 1;  // Right pointer starts at the end of the array

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // If we found a triplet, add it to the result set
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicate values for the second and third elements
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    // Move the pointers after finding a valid triplet
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;  // We need a larger sum, so move the left pointer right
                } else {
                    right--;  // We need a smaller sum, so move the right pointer left
                }
            }
        }

        // Convert the result set to a list and return
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        Solution4 solution = new Solution4();
        int[] nums = {-1, 0, 1, 2, -1, -4};                                                
        List<List<Integer>> triplets = solution.threeSum(nums);
        System.out.println(triplets);  // Expected output: [[-1, -1, 2], [-1, 0, 1]]
    }
}

 //time complexity : O(n*n)
 //space complexity : O(n)

// The solution uses a sorted array and the two-pointer approach to find all unique triplets that sum to zero. It iterates through the array while skipping duplicates, using two pointers to find valid pairs that, when added to the current element, sum to zero.
// Time Complexity: O(n²) due to the sorting step and the two-pointer traversal.
// Space Complexity: O(n) for storing the unique triplets in a set.





