class Solution5 {
    public int getSecondLargest(int[] arr) {
        
        if(arr.length<2){
            return -1;
        }

        int max1 = Integer.MIN_VALUE;  // The largest element
        int max2 = Integer.MIN_VALUE;  // The second largest element
        
        // Initialize the largest and second largest elements
        if(arr[0]>arr[1]){
            max1=arr[0];
            max2=arr[1];
        }
        else{
            max1=arr[1];
            max2=arr[0];
        }
        
        for(int i=2;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            else if(arr[i]>max2){
                max2=arr[i];
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        Solution5 solution = new Solution5(); // Create an instance of the Solution class
        int[] nums = {23,67,32,1,5,90,33,87};
        System.out.println(solution.getSecondLargest(nums)); // Call the method
    }

}

 //time complexity : O(n)
 //space complexity : O(1)

// The solution efficiently finds the second largest element in an array by iterating through it once, maintaining two variables for the largest and second largest elements. It updates these variables as it processes each element.
// Time Complexity: O(n) since the array is traversed once.
// Space Complexity: O(1) as only a constant amount of extra space is used for the two variables max1 and max2.