import java.util.*;
public class Linked_List1 {
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

    //iterative search
    public int itrSearch(int key){
        Node temp= head;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    // recursive search
    public int helper(Node head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next , key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);

    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next= prev;
            prev= curr;
            curr = next;

        }
        head=prev;
    }
    public void deleteNthfromEnd(int n){
        int sz=0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        if(n== sz){
            head= head.next;
            return;
        }
        int i=1;
        int iToFind= sz-n;
        Node prev = head;
        while(i < iToFind){
            prev= prev.next;
            i++;
        }
        prev.next= prev.next.next;
        return;
    }
    private Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;//+1
            fast= fast.next.next;//+2
        }
        return slow;// slow is middle
    }

    public boolean checkPalindrome(){
        if(head== null || head.next == null){
        return true;
    }
        //find mid
        Node mid= findMid(head);

        //reverse 2nd half
        Node prev = null;
        Node curr = mid;
       
        while(curr != null){
             Node next= curr.next;
            curr.next = prev;
            curr=prev ;
            curr= next;
        }
        Node right= prev; // right half ka head
        Node left = head ;// left half ka head

        //check left and right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right= right.next;
        }
        return true;
    }
    public static boolean isCycle(){ // Floyd's Cycle finding Algorithm
        Node slow = head;
        Node fast= head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        //detect cycle
        Node slow= head;
        Node fast = head ;
        boolean cycle= false;
        while(fast != null && fast.next!= null){
            slow=slow.next;
            fast= fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }

        }
        if(cycle==false){
            return;
        }
        // find meeting point
        slow=head;
        Node prev= null;
        while(slow != fast){
            prev=fast;
            slow=slow.next;
            fast = fast.next;
        }
        // remove cycle -> last.next = null
        prev.next=null;
    }

    // get mid function
    private Node getMid(Node head){
        Node slow= head;
        Node fast = head.next;
        while(fast!= null && fast.next != null){
            slow= slow.next;
            fast= fast.next.next;
        }
        return slow;//mid node
    }
    private Node merge(Node head1, Node head2){
        Node mergedLL= new Node(-1);
        Node temp = mergedLL;
        while (head != null && head2 != null){
            if(head1.data <=head2.data){
                temp.next= head1;
                head1= head1.next;
                temp= temp.next;
            
            }
            else{
                temp.next= head2;
                head2=head2.next;
                temp= temp.next;
            }

        }
        while(head1 !=null ){
            temp.next=head;
            head1= head1.next;
            temp= temp.next;
        }
        while(head2 != null){
            temp.next= head2;
            head2= head2.next;
            temp= temp.next;
        }
        return mergedLL.next;
    }
    //merge sort
    public Node mergeSort(Node head){
        if(head==null || head.next== null){
            return head;
        }
        //find mid
        Node mid= getMid(head);
        //left & right MS
        Node rightHead= mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft, newRight);
    }


    //Zig Zag Linked List
     public void zigZag(){
        //find mid
        Node slow= head;
        Node fast= head.next ;
        while(fast != null&& fast.next!= null){
            slow= slow.next;
            fast= fast.next.next;

        }
        Node mid = slow;
        //reverse 2nd half
        Node curr= mid.next;
        mid.next= null;
        Node prev= null;
        Node next;

        while(curr!= null){
            next= curr.next;
            curr.next=prev;
            prev= curr;
            curr= next;
        }
        Node left = head;
        Node right= prev;
        Node nextL, nextR;


        //alt merge zig zag merge
        while(left != null && right != null){
            nextL= left.next;
            left.next=right;
            nextR= right.next;
            right.next= nextL;
            left= nextL;
            right= nextR;
        }
    }

    public static void main(String args[]){
       /* Linked_List1 ll= new Linked_List1();
       /*one of the way to add Linked lIst  ll.head = new Node(1);
        ll.head.next= new Node(2);
        //ll.print();
        ll.addFirst(3);
        //ll.print();
        ll.addFirst(1);
        //ll.print();
        ll.addLast(4);
        //ll.print();
        ll.addLast(5);
        //ll.print();

        ll.add(2,3);
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.recSearch(3));
        System.out.println(ll.recSearch(10));
        ll.reverse();
        ll.print();
        ll.add(3,1);
        //ll.deleteNthfromEnd(3);
        ll.print();
        System.out.println(ll.checkPalindrome());*/


        // head= new Node(1);
        // head.next= new Node(2);
        // head.next.next.next= new Node(3);
        // head.next.next.next.next= head;
        // System.out.println(isCycle());
        // removeCycle();

        LinkedList ll= new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        System.out.print(ll);
       // ll.zigZag();
        //ll.head = ll.mergeSort(ll.head);
        System.out.print(ll);



    }
}