class Solution6 {
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

    public static void main(String[] args) {
        Solution6 solution = new Solution6(); // Create an instance of the Solution class
        System.out.println(solution.longestValidParentheses("(()")); // Call the method
    }
}


 //time complexity : O(n)
 //space complexity : O(1)

// The first solution finds the length of the longest valid parentheses substring using two traversals. It counts left and right parentheses, updating the maximum length when a valid pair is found, and resets the counters when invalid sequences are encountered.

// The second solution efficiently finds the second largest element in an array by iterating once through the array while maintaining two variables to track the largest and second largest elements.

// Time Complexity: O(n) for both solutions as each array or string is traversed once.
// Space Complexity: O(1) for both solutions since only a constant amount of extra space is used for variables.