class Solution6 {
    public int longestValidParentheses(String s) {
        //initialize left and right counter as 0
        int open=0;
        int close=0;
        //max is for calculate the valid pair
        int len=0;
        int max=0;

        //left to right traversion
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                open++;
            }
            else{
                close++;
            }
            if(open==close){
                len=open+close;
                max=Math.max(max,len);
            }
            //for invalid
            else if(close>open){
                open=0;
                close=0;
            }
        }

        //right to left traversion<(()>
        open=0;
        close=0;

        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='('){
                open++;
            }
            else{
                close++;
            }
            if(open==close){
                len=open+close;
                max=Math.max(max,len);
            }
            else if(open>close){
                open=0;
                close=0;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        Solution6 solution = new Solution6(); // Create an instance of the Solution class
        System.out.println(solution.longestValidParentheses("(()")); // Call the method
    }
}


 //time complexity : O(n)
 //space complexity : O(1)

// The first solution finds the length of the longest valid parentheses substring using two traversals. It counts open and close parentheses, updating the maximum length when a valid pair is found, and resets the counters when invalid sequences are encountered.

// Time Complexity: O(n) for both solutions as each array or string is traversed once.
// Space Complexity: O(1) for both solutions since only a constant amount of extra space is used for variables.