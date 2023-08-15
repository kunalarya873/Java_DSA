import java.util.LinkedList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.*;
public class Linked_List {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next= null;
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        // Step1 create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail= newNode;
        }
        //Step2 = newNode next = head
        newNode.next = head ;

        //step = head= newNide
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head = tail= newNode;
            return;
        }
        tail.next= newNode;
        tail= newNode;
    }
    
    public void print(){
        if(head==null){
            head= new Node(data);
            System.out.println("LL is Empty");
            return;
    }
        else{
        Node temp=head;
        while(temp.next != null){
                System.out.println(temp.data+"->");
                temp= temp.next;
            }
            temp.next= new Node(data);
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
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp= temp.next;
            i++;
        }
        newNode.next= temp.next;
        temp.next= newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
        }
        else if(size ==1){
            int val= head.data;
            head= tail= null;
            return val;
        }
        int val= head.data;
        head= head.next;
        return val;
    }

    public int removeLast(){
        if(size==0){
            System.out.println("ll is null");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev= head;
        for(int i=0; i<size-2; i++){
            prev= prev.next;
        }
        int val= prev.next.data;
        tail= prev;
        size--;
        return val;
    }
    public int itrSearch(int key){
        Node temp= head;
        int i=0;
        while(temp != null){
            if(temp.data==key){
                return i;
                
            }
            temp= temp.next;
            i++;
        }
        return -1;
    }


    public int helper(Node head, int key){
        if(head==null){
            return -1;
        }
        if(head.data ==key){
            return 0;
        }
        int idx =helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head, key);
    }
    }

    //reverse a linked list
    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr!= null){
            next = curr.next;
            curr.next= prev;
            prev= curr;
            curr= next;
        }
        head = prev;


    }

    public static void main(String args[]){
        LinkedList ll= new LinkedList();
        System.out.println(ll);
        ll.addFirst(2);
        System.out.println(ll);
        ll.addFirst(1);
        System.out.println(ll);
        ll.addLast(3);
        System.out.println(ll);
        ll.addLast(4);
        System.out.println(ll);
        ll.add(4,5);
        ll.removeFirst();
        System.out.println(ll);
        //int temp= ll.size();
        //System.out.println(ll.size());
        //System.out.println(temp);

        ll.removeLast();
        System.out.println(ll);

        int key =4;
        //int l= ll.recSearch();
        System.out.println();



        ll.reverse();
        ll.print();
    }
}