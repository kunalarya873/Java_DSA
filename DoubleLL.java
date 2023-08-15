public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node (int data){
            this.data= data;
            this.prev= null;
            this.next= null;

        }
    }
        public static Node head;
        public static Node tail;
        public static int size;

        //addFirst
        public void addFirst(int data){
            Node newNode = new Node(data);
            size++;
            if(head==null){
                head= tail= newNode;
                return;
            }
            newNode.next= head;
            head.prev= newNode;
            head= newNode;

        }
        //print
        public void print(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+"<->");
                temp= temp.next;

            }
            System.out.print("null");
            System.out.println();
        }
        //removeFirst
        public int removeFirst(){
            if(head== null){
                System.out.println("DLL is empty");
                return Integer.MIN_VALUE;
            }
            if(size==1){
                int val= head.data;
                head= tail= null;
                size--;
                return val;

            }
            int val = head.data;
            head= head.next;
            head.prev= null;
            size--;
            return val;
        }
    
        //Homework to write add last and remove last


        //addLast
        public void addLast(int data){
            Node newNode = new Node(data);
            size++;
            if(head==null){
                head= tail= newNode;
                return;
            }
            tail.next=newNode;
            newNode.next=null;
            tail= newNode;

        }


        //removeLast
        public int removeLast(){
            if(head== null){
                System.out.println("DLL is empty");
                return Integer.MIN_VALUE;
            }
            if(size==1){
                int val= head.data;
                head= tail= null;
                size--;
                return val;
//Not Correct
            }
            int val=tail.data;
            tail=tail.prev;
            tail.next=null;
            size--;
            return val;
        }

        public void reverse(){
            Node curr = head;
            Node prev= null;
            Node next;

            while(curr != null){
                next= curr.next;
                curr.next=prev;
                curr.prev= next;
                prev= curr;
                curr= next;

            }
            head= prev;

        }

    public static void main(String Args[]){

        DoubleLL dll= new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        System.out.println(dll.size);
        dll.removeFirst();
        dll.print();
        dll.addLast(5);
        dll.print();
        // dll.removeLast();
        // dll.print();
        dll.reverse();
        dll.print();
    }
}
