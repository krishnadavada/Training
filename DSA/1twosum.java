class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //loop for first num
        for (int i = 0; i < nums.length; i++) {
            
            //loop for second num
            for (int j = i + 1; j < nums.length; j++) {
                
                int complement=target-nums[i];
                
                //check complement present in nums or not
                if (complement == nums[j]) {
                    // Return the indices as an array
                    return new int[]{i, j}; 
                }
            }
        }
        return new int[] {-1,-1};

    }

    public static void main(String[] args) {
        Solution solution = new Solution(); // Create an instance of the Solution class
        int[] result = solution.twoSum(new int[]{2, 11, 7, 15}, 9); // Call the method
        System.out.println("[" + result[0] + ", " + result[1] + "]"); // Print the result
    }
}

 //time complexity : O(n^2)
 //space complexity : O(1)

//  The given code implements the two-sum problem using a brute-force approach. It uses two nested loops to check every possible pair of numbers in the array. For each pair, it checks if the sum of the two numbers equals the target value, and if so, returns their indices.
// Time Complexity: O(n²) because of the two nested loops where each loop runs for the entire length of the array.
// Space Complexity: O(1) as no extra space is used other than the input array and the result array, which holds only two indices.
// This is an inefficient solution for larger arrays due to its quadratic time complexity.