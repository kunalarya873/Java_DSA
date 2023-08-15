import java.util.*;
public class Queue_Questions {

    // First non-repeating Letter in a stream of characters
    public static void printNonRepeating(String str){
        int freq[]= new int[26];
        Queue<Character> q= new LinkedList<>();
        for(int i=0; i<str.length(); i++){
            char ch= str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
            while(!q.isEmpty() && freq[q.peek()- 'a']> 1){
                q.remove();
            }
            if(q.isEmpty()){
                System.out.print(-1+" ");
            }
            else{
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }

    //Question 2
    //interleave 2 halves of a Queue even length
      public static void interLeave(Queue<Integer> q){
        Queue<Integer> firstHalf= new LinkedList<>();
        int size= q.size();
        for(int i=0; i<size/2; i++){
            firstHalf.add(q.remove());
        }
        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
    }

    //Question 3
    //Queue Reversal
    public static void reversal(Queue<Integer> q){
        Stack<Integer> s= new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }

    //Deque
    

    public static void main(String args[]){
        // String str= "aabccxb";
        // printNonRepeating(str);
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        // interLeave(q);
        // while(!q.isEmpty()){
        //     System.out.print(q.remove()+" ");
        // }
        // System.out.println();
        reversal(q);
        while(!q.isEmpty()){
            System.out.print(q.remove() +" ");
        }
    }
}
