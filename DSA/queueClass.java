public class queueClass {
    static int arr[];
    static class queue{
        static int rear=-1;
        static int size;

        queue(int n){
           this.size=n;
           arr=new int[size];
        }
        
        public static boolean isEmpty(){
            return rear==-1;
        }

        //add
        public static void enque(int data){
           if(rear==size-1){
            System.out.println("Queue is full");
            return;
           }
           rear++;
           arr[rear]=data;
        }

        //remove
        public static int dequeue(){
           if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
           }

           int front=arr[0];
           for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
    }
 }
        public static void main(String[] args) {
            queue q=new queue(5);
            q.enque(1);
            q.enque(2);
            q.enque(3);
            q.enque(4);
            q.enque(5);
            System.out.println("Dequeued item is "+q.dequeue());
            System.out.println("Dequeued item is "+q.peek());
        }
}