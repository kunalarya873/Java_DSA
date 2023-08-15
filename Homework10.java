import java.util.*;
public class Homework10 {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next = null;
        }
    }
        public static Node head;
        public static Node tail;
        public static int size;
    public void addFirst(int data){
        //step 1 create new node
        Node newNode= new Node(data);
        size++;
        if(head== null){
            head = tail= newNode;
            return;
        }
        // step2 neNode= head
        newNode.next= head;

        // step 3 head = new node
        head = newNode;

    }
    public void addLast(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head= tail= newNode;
            return;
        }
        tail.next= newNode;
        tail = newNode;
    }
    public void print(){
        
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        else{
            Node temp=head;
            while(temp != null){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
        System.out.println();
    }
    }
    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp= head;
        int i=0;
        while(i<idx-1){
            temp= temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if(size ==1){
            int val= head.data;
            head = tail= null;
            size =0;
            return val;
        }
        head= head.next;
        int val = head.data;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MAX_VALUE;
        }
        else if(size ==1){
            int val =head.data;
            head = tail = null;
            size=0;
            return val;
        }
        Node prev= head;
        for(int i=0; i<size-2; i++){
            prev =prev.next;
        }
        int val = prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    //Question no.1
    public static Node findMid(Node head){
        Node slow= head;
        Node fast= head.next;
        while(slow!= null&& fast!= null){
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow;

    }

    public static boolean checkPalindrome(Node head){
        Stack<Integer> s = new Stack<>();
        Node mid= findMid(head);
        boolean isPalin= true;
        int j=mid.data;
        int arr[]= new int[j];
        while(head!= mid){
            s.push(head.data);
            head=head.next;
        }
        while(head!=null){
            arr[j]=s.pop();
            while(mid!=null){
            if(arr[j]==mid.next.data){
                return isPalin=true;
            }else {
                return isPalin=false;
            }
            }
        }
        return isPalin;

    }
    class Node1 {
        int data;
        Node ptr;
        Node1(int d)
        {
        ptr = null;
        data = d;
    }
}

    public static void main(String Args[]){
        Node1 one = new Node1(1);
        Node1 two = new Node1(2);
        Node1 three = new Node1(3);
        Node1 four = new Node1(4);
        Node1 five = new Node1(3);
        Node1 six = new Node1(2);
        Node1 seven = new Node1(1);
        one.ptr = two;
        two.ptr = three;
        three.ptr = four;
        four.ptr = five;
        five.ptr = six;
        six.ptr = seven;
        boolean condition = checkPalindrome(one);
        System.out.println("Palindrome :" + condition);
    }
        
        
    }
