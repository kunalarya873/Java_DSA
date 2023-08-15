import java.util.*;
public class DequeB {
    static class Stack{
        Deque<Integer> deque = new LinkedList<>();
        public void push(int data){
            deque.addLast(data);
        }
        public int pop(){
            return deque.removeLast();
        }
        public int peek(){
            return deque.getLast();
        }
    }

    static class Queue{
        Deque<Integer> deque = new LinkedList<>();
        public void add(int data){
            
                deque.addLast(data);
            }
        
            public int remove(){
                return deque.removeFirst();
        }
        public int peek(){
            return deque.getFirst();
        }
    }


    public static void main(String args[]){
        // Deque<Integer> deque = new LinkedList<>();
        // deque.addFirst(1);
        // deque.addFirst(2);
        // System.out.println(deque);
        // deque.addLast(3);
        // deque.addLast(3);
        // System.out.println(deque);
        // deque.removeLast();
        // System.out.println(deque);
        // System.out.println("first el "+ deque.getFirst());
        // System.out.println("last el "+ deque.getLast());

        // Stack s= new Stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // System.out.println("peek=" +s.peek());
        // System.out.println("pop="+ s.pop());
    
        Queue q= new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("peek is "+q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

        // Scanner sc= new Scanner(System.in);
        LinkedList<Integer> q1= new LinkedList<>();
        //int temp=0;
        // while(!q1=0){
        //     temp=q1.peek();
           System.out.println( Math.pow(5, 2));
           int n=5;
           int temp=0;
           for(int i=1; i<=n; i++){
            //temp=Math.pow(10, i)+Math.pow(10,i-1);
            n= n/2;
            q1.add(n%2);
           }
           while(q1.isEmpty()){
            System.out.print(q1.pop());
           }

    }
}
