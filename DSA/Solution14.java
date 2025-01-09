import java.util.*;
public class Solution14 {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            queue.add(i);
        }
        int sec=0;
        while(!queue.isEmpty()){
           sec++;
           int person=queue.poll();
           if(tickets[person]>=1){
              tickets[person]--;
           }
           if(person==k && tickets[person]==0){
             break;
           }
            if(person!=k && tickets[person]==0){
             continue;
           }
           queue.add(person); 
        }
        return sec;
    }

    public static void main(String[] args) {
      Solution14 solution = new Solution14();

      // Example input
      int[] tickets = {2, 3, 2};
      int k = 2;

      // Call the function and print the result
      System.out.println("Time required to buy tickets: " + solution.timeRequiredToBuy(tickets, k));
  }
} 
