//kaden's algorithm
class Solution3 {
    public int maxSubArray(int[] nums) {

        int currentSum=0;
        int maximum=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){

            currentSum+=nums[i];
            
            //max element from maximum and currentSum
            maximum=Math.max(maximum,currentSum);
            
            //if currentSum is negative then reset it
            if(currentSum<0){
               currentSum=0;
            }
        }
        return maximum;
    }

   public static void main(String[] args) {
        Solution3 solution = new Solution3(); // Create an instance of the Solution class
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(solution.maxSubArray(nums)); // Call the method
      
    }
}

 //time complexity : O(n)
 //space complexity : O(1)

// Kadane's algorithm efficiently solves the maximum subarray sum problem by iterating through the array once. It keeps track of the current sum and resets it to zero if it becomes negative, while also tracking the maximum sum encountered.
// Time Complexity: O(n) as the array is traversed once.
// Space Complexity: O(1) since only a constant amount of extra space is used for variables.





