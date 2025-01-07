// class Solution {
//     public int search(int[] nums, int target) {
//         int s=0;
//         int e=nums.length-1;

//         while(s<=e){
//             int mid=s+(e-s)/2;

//             if(nums[mid]==target){
//                 return mid;
//             }

//             //check left half sorted or not
//             if(nums[s]<=nums[mid]){
//               if(nums[s]<=target && target<=nums[mid]){
//                 e=mid-1;
//               }
//               else{
//                 s=mid+1;
//               }
//             }
//             //right half sorted
//             else{
//              if(nums[mid]<=target && target<=nums[e]){
//                 s=mid+1;
//               }
//               else{
//                 e=mid-1;
//               }
//             }
//         }
//             return -1;

//     }
// }

//or

class Solution8 {
  public int search(int[] nums, int target) {
      int low = 0;
      int high = nums.length - 1;

      // Binary Search Implementation
      while (low <= high) {
          int mid = low + (high - low) / 2; // Avoid overflow
          if (nums[mid] == target) {
              return mid; // Target found
          } else if (nums[mid] < target) {
              low = mid + 1; // Target is in the right half
          } else {
              high = mid - 1; // Target is in the left half
          }
      }

      return -1; // Target not found
  }

  public static void main(String[] args) {
      Solution8 solution = new Solution8();

      // Example Test Cases
      int[] nums = {-1, 0, 3, 5, 9, 12};
      int target1 = 9;
      int target2 = 2;

      System.out.println("Index of " + target1 + ": " + solution.search(nums, target1)); // Output: 4
      System.out.println("Index of " + target2 + ": " + solution.search(nums, target2)); // Output: -1
  }
}

 //time complexity : O(log n)
 //space complexity : O(1)

// The solution implements a binary search algorithm to find the target in a sorted array. It continuously divides the array into two halves, adjusting the search range based on whether the target is smaller or larger than the middle element.

// Time Complexity: O(log n) due to the halving of the search space with each iteration.
// Space Complexity: O(1) as only a constant amount of extra space is used for the pointers.