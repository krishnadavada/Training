import java.util.Stack;
    public class 15ListNode {
        int val;
        ListNode next;
       ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
   
  class Solution15 {
      public ListNode removeNodes(ListNode head) {
          Stack<ListNode> stack=new Stack<>();
          //insert all nodes in stack
          ListNode temp=head;
          while(temp!=null){
              stack.push(temp);
              temp=temp.next;
          }
          //create answer list
          //first element store in newList
          ListNode newList=stack.pop();
          //first as max
          int max=newList.val;
          while(!stack.isEmpty()){
              ListNode node=stack.pop();
              if(node.val<max){
                  continue;
              }
              else{
                  //insert at head
                  node.next=newList;
                  newList=node;
                  max=node.val;
              }
          }
          return newList;
      }
  
      public static void main(String[] args) {
          Solution15 solution = new Solution15();
          
          // Example: Create a linked list: 5 -> 2 -> 13 -> 3 -> 8
          ListNode head = new ListNode(5);
          head.next = new ListNode(2);
          head.next.next = new ListNode(13);
          head.next.next.next = new ListNode(3);
          head.next.next.next.next = new ListNode(8);
      
          // Call the removeNodes method
          ListNode result = solution.removeNodes(head);
      
          // Print the result list
          while (result != null) {
              System.out.print(result.val + " -> ");
              result = result.next;
          }
          System.out.println("null");
      }
      
  }



 //time complexity : O(n)
 //space complexity : O(n)

// The removeNodes method removes nodes in a linked list that have smaller values than any subsequent nodes. It uses a stack to reverse the list and processes it from the last node to the first. Nodes with values smaller than the current maximum are discarded, and the remaining nodes are linked together.