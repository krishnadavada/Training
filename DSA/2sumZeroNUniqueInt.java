import java.util.ArrayList;
import java.util.List;

class Solution2 {
    public int[] sumZero(int n) {

      //create a list 
      List<Integer> list = new ArrayList<>();

      //if n is odd add 0 in list
      if(n%2!=0){
        list.add(0);
      }

      //if n is grater then 1 then add one positive and one negative number
      if(n > 1) {
       for(int i=1;i<n;i=i+2){
         list.add(i);
         list.add(-i);
      }
      }

      int[] result = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                result[i] = list.get(i);
            }
            
            return result;
    }
    
    public static void main(String[] args) {
        Solution2 solution = new Solution2(); // Create an instance of the Solution class
        int[] result = solution.sumZero(4); // Call the method
        System.out.println(java.util.Arrays.toString(result));
    }
    
}

    //time complexity : O(n)
    //space complexity : O(n)
  
    // The solution generates a list of integers where the sum of all elements is zero. For an odd number n, it adds 0 to the list. For even n, it adds positive and negative pairs of integers. The list is then converted to an array and returned.
    // Time Complexity: O(n) as the loop runs up to n times.
    // Space Complexity: O(n) due to the storage required for the list.
    