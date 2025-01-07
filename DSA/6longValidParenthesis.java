class Solution {
    public int longestValidParentheses(String s) {
        //initialize left and right counter as 0
        int l=0;
        int r=0;
        //max is for calculate the valid pair
        int max=0;

        //left to right traversion
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                l++;
            }
            else{
                r++;
            }
            if(l==r){
                max=Math.max(max,l*2);
            }
            //for invalid
            else if(r>l){
                l=0;
                r=0;
            }
        }

        //right to left traversion<(()>
        l=0;
        r=0;

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='('){
                l++;
            }
            else{
                r++;
            }
            if(l==r){
                max=Math.max(max,l*2);
            }
            else if(l>r){
                l=0;
                r=0;
            }
        }
        return max;
    }
}

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

// The first solution finds the length of the longest valid parentheses substring using two traversals. It counts left and right parentheses, updating the maximum length when a valid pair is found, and resets the counters when invalid sequences are encountered.

// The second solution efficiently finds the second largest element in an array by iterating once through the array while maintaining two variables to track the largest and second largest elements.

// Time Complexity: O(n) for both solutions as each array or string is traversed once.
// Space Complexity: O(1) for both solutions since only a constant amount of extra space is used for variables.