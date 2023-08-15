import java.util.*;
public class Homework9 {
    public class Node{
    int data;
    Node next;
    Node prev;
    }
    // static Node push( Node head_ref, int new_data){
    // Node new_node = new Node();
    // new_node.data = new_data;
    // new_node.next = (head_ref);
    // (head_ref) = new_node;
    // return head_ref;
    // }
    public void push(int new_data){
        Node new_Node = new Node();
        new_Node.next = head;
        head = new_Node;
    }
// static void printList( Node head){
//     Node temp = head;
//     while (temp != null){
//         System.out.printf("%d ", temp.data);
//         temp = temp.next;
//     }
//     System.out.printf("\n");
// }



public void printList(){
    Node tNode = head;
    while (tNode != null) {
        System.out.print(tNode.data + " ");
        tNode = tNode.next;
}
}
    // static Node (int data){
    //     this.data= data;
    //     this.prev= null;
    //     this.next= null;

    // }

    public static Node head;
    public static Node tail;
    public static int size=1;

    static void solution2( Node head, int m, int n){
        Node curr=head , t;
        int i=0;
        while(curr != null){
        for(i=1; i<m && curr!= null ; i++){
            curr= curr.next;
            t= curr.next;
            for(i=1;i <=n && t != null; i++){
                Node temp =t;
                t= t.next;
            }
            curr.next=t;
            curr=t;
        }
    }
    }



    //solution 3

    public static void solution3(int m, int n){
        Node curr11=null;
        Node curr12=head;
        Node curr13= head.next;
        Node curr21=null;
        Node curr22=head;
        Node curr23= head.next;
        while(curr12.data!=m && curr12!=null){
            curr11= curr12;
            curr12=curr13.next;
        }
        while(curr22.data!=n && curr22!=null){
            curr21= curr22;
            curr22=curr23.next;
        }
        if(curr12== null || curr22==null){
            return;
        }
        {
        if(curr11 !=null){
            curr11.next= curr22;
        }
        else
            head=curr22;
    
        if(curr22 != null){
            curr22.next= curr11;
        }
        head=curr12;
    }
        Node temp= curr12.next;
        curr12.next= curr22.next;
        curr22.next= temp;
    }
    
    public static void main(String Args[]){
        // Node head = null;
        // int M=2, N=3;
        // head=push(head, 10);
        // head=push(head, 9);
        // head=push(head, 8);
        // head=push(head, 7);
        // head=push(head, 6);
        // head=push(head, 5);
        // head=push(head, 4);
        // head=push(head, 3);
        // head=push(head, 2);
        // head=push(head, 1);

        // LinkedList dl = new LinkedList();
        // dl.addFirst(4);
        // dl.addFirst(5);
        // dl.addFirst(6);
        // dl.addFirst(7);
        // Scanner sc= new Scanner(System.in);
        // int m= sc.nextInt();
        // int n= sc.nextInt();
        // ll.solution2(ll.head, m,n);
        // solution2(head, M, N);
        // printList(head);


        LinkedList llist = new LinkedList();
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
        System.out.println(llist);
        llist.solution3(3,5);
        System.out.println(llist);


    }
}