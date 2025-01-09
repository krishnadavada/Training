class Solution13 {
    public int firstUniqChar(String s) {
        //convert str to character array
        char[] arr=s.toCharArray();

        //iterate all the character in array
        for(int i=0;i<s.length();i++){
            boolean isUnique=true;

            for(int j=0;j<s.length();j++){
                //check if char is reapeted then break
               if(i!=j && arr[i]==arr[j]){
                   isUnique=false;
                   break;
                }
            }
            //if char is unique then return index
            if(isUnique){
                return i;
            }
        }
        return -1; 
    } 

    public static void main(String[] args) {
        Solution13 solution = new Solution13();
        System.out.println(solution.firstUniqChar("loveleetcode"));
    }
}

 //time complexity : O(n^2)
 //space complexity : O(n)

// This solution finds the first unique character in a given string by using a brute-force approach. It converts the string into a character array and iterates through each character in the string. For each character, it checks if it appears again in the string using a nested loop. If no duplicate is found, it returns the index of the first unique character. If no unique character exists, it returns -1.
