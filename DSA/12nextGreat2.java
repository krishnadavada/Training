import java.util.Stack;
class Solution12 {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Iterate through the array twice to handle the circular nature
        for (int i = 2 * n - 1; i >= 0; i--) {
            int index = i % n; // Current index in the circular array
            
            // Pop elements from the stack that are less than or equal to the current element
            while (!stack.isEmpty() && stack.peek() <= nums[index]) {
                stack.pop();
            }
            
            // If stack is not empty, the top element is the next greater element
            ans[index] = stack.isEmpty() ? -1 : stack.peek();
            
            // Push the current element to the stack
            stack.push(nums[index]);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        Solution12 solution = new Solution12();
        int[] nums = { 1, 2, 3, 4, 3};  
            int[] result = solution.nextGreaterElements(nums);
            for (int i : result) {
                System.out.print(i + " ");
            }
                
    }
}

 //time complexity : O(n)
 //space complexity : O(n)

 //The solution finds the next greater element for each element in a circular array. It uses a monotonic stack to efficiently track potential next greater elements while iterating the array twice to handle the circular nature. For each element, the stack is updated, and the next greater element is determined or set to -1 if none exists. The result is returned as an array.






