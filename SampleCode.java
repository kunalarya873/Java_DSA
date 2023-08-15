import java.util.*;
public class SampleCode{
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
public static boolean isCycle(){
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


    public static void main(String args[]){
        head= new Node(1);
        head= head.next= new Node(2);
        head.next.next.next= new Node(3);
       // head.next.next.next.next= head;
        System.out.println(isCycle());

    }
}