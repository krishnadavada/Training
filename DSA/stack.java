import java.util.ArrayList;
class stackClass{
    static class stack {

        static ArrayList<Integer> arr=new ArrayList<>();
        public static boolean isEmpty(){
              return arr.size()==0;
        }
        //push
        public static void push(int data){
             arr.add(data);
        }
        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            return top;
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                return -1; 
            }
            return arr.get(arr.size()-1);
    
       
    }
    public static void main(String args[]){
        stack s=new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop()); // prints 30
        System.out.println(s.peek());
    }
    }    
}
