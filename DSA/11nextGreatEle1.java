//using stack and hashmap
// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         // Map to store the next greater element for each number in nums2
//         HashMap<Integer, Integer> map = new HashMap<>();
//         Stack<Integer> stack = new Stack<>();

//         // Iterate over nums2 and compute the next greater element for each number
//         for (int num : nums2) {
//             // While stack is not empty and current number is greater than the top of the stack
//             while (!stack.isEmpty() && num > stack.peek()) {
//                 map.put(stack.pop(), num);
//             }
//             // Push the current number onto the stack
//             stack.push(num);
//         }


//         for (int i = 0; i < nums1.length; i++) {
//             nums1[i] = map.getOrDefault(nums1[i], -1);
//         }

//         return nums1;
//     }

  
// }


class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            int max = -1;
            for(int j = 0; j < nums2.length; j++){
                int index = j;
                if(nums1[i] == nums2[j]){ // Found element in nums2 that matches current element in nums1
                    while(index != nums2.length){ // Iterate through remaining elements in nums2 to find next greater element
                        if(nums2[index] > nums1[i]){
                            max = nums2[index]; // Update max if we find a greater element
                            break;
                        }
                        index++;
                    }
                }
            }
            ans[i] = max;
        }
        return ans;
    }
}

 //time complexity : O(m*n)
 //space complexity : O(n)

// The given code defines a solution to find the next greater element for each element in nums1 within the array nums2. For each element in nums1, the program identifies its position in nums2 and scans the subsequent elements to locate the first element greater than the current element. If no such element is found, it assigns -1. The result is returned as an array.






