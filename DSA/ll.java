public class ll {
    Node head;
    private int size;

    ll(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    //add first,last
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    //add last
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        Node currentNode=head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=newNode;
    }

    //delete first,last
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }
    
    //delete last
    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node currentNode=head;
        while(currentNode.next.next!=null){
            currentNode=currentNode.next;
        }
        currentNode.next=null;
    }
    

    //print
    public void print(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.data+" -> ");
            currentNode=currentNode.next;
        }
        System.out.print("null");
    }

    public int getSize(){
        return size;
    }

    public static void main(String args[]){
        ll l1 = new ll();
        l1.addFirst("this");
        l1.addLast("is");
        l1.addLast("class");
        l1.deleteFirst();
        l1.deleteLast();
        l1.print();
        System.out.println("Size : "+l1.getSize());
    }
}
