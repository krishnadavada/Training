class Solution16 {
    public boolean isValid(String s) 
    {
        while(true)
        {
           // check the pair of (),[],{} str contains or not
           //if contains replace with null
           if(s.contains("()")){
                s=s.replace("()","");//replace method traverse the str 
            }
            else if(s.contains("[]")){
                s=s.replace("[]","");
            }
            else if(s.contains("{}")){
                s=s.replace("{}","");
            }
            else{
                //at the end str going to empty (isEmpty is true so return true)
                return s.isEmpty();
            }
        }
    }

    public static void main(String[] args) {
        Solution16 solution=new Solution16();
        System.out.println(solution.isValid("([])")); 
    }

}

 //time complexity : O(n^2)
 //space complexity : O(1)

// This solution checks whether a string containing parentheses, square brackets, and curly braces is valid. It repeatedly removes matching pairs ("()", "[]", "{}") from the string until no more pairs can be removed. If the string is empty after all removals, it returns true, indicating the string is valid; otherwise, it returns false.