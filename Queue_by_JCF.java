import java.util.*;
public class Queue_by_JCF {
    static class Queue{
        static Stack<Integer> s1= new Stack<>();
        static Stack<Integer> s2= new Stack<>();
        //remove
        public static boolean isEmpty(){
            return s1.isEmpty();
        }
        //add
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return s1.pop();
        }
        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String args[]){
        // Queue<Integer> q= new LinkedList<>();//ArrayDeque
        // //we can also write the above line like 
        // //Queue<Integer> q = new ArrayDeque<>();
        // q.add(1);
        // q.add(2);
        // q.add(3);
        // while(!q.isEmpty()){
        //     System.out.println(q.peek());
        //     q.remove();

        Queue q= new Queue();
            q.add(1);
            q.add(2);
            q.add(3);
            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }
    }