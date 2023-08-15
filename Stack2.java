import java.util.*;
public class Stack2 {

    //Question no.1
    //Push at bottom of the stack
    public static void pushAtBottom(Stack<Integer>s,Integer data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top= s.pop();
        pushAtBottom(s, data); 
        s.push(top);
    }

    //Question no.2
    //Reverse a String using a Stack
    public static String reverseString(String str){
        Stack<Character> s= new Stack<>();
        int idx=0;
        while(idx< str.length()){
            s.push(str.charAt(idx));
        }
        StringBuilder result= new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        return result.toString();
    }

    //Question 3
    //Reverse a Stack
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }
    public static void printStatic(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    //Question no.3
    //Stack Span Problem
    public static void stockSpan(int stocks[], int span[]){
        Stack<Integer> s= new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1; i<stocks.length; i++ ){
            int currPrice= stocks[i];
            while(!s.isEmpty() && currPrice > stocks[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;
            }
            else{
                int prevHigh = s.peek();
                span[i]= i-prevHigh;
            }
            s.push(i);

            }
        }

        // Valid parentheses
        public static boolean isValid(String str){//O(n)
            Stack<Character> s = new Stack<>();
            for(int i=0; i<str.length(); i++){
                char ch= str.charAt(i);
                if(ch=='{' || ch=='[' || ch=='('){
                    s.push(ch);
                }
                else{
                    //closing
                    if(s.isEmpty()){
                        return false;
                    }
                    if((s.peek()== '(' && ch==')')
                    || (s.peek()=='{' && ch=='}')
                    ||(s.peek()=='[' && ch==']')){
                        s.pop();
                    }else{
                        return false;
                    }
                }
            }
            if (s.isEmpty()){
                return true;
            }else{
                return false;
            }
        }

        //Duplicate Parentheses
        public static boolean isDuplicate(String str){//O(n)
            Stack<Character> s= new Stack<>();
            for(int i=0; i<str.length(); i++){
                char ch= str.charAt(i);

                //closing 
                if(ch==')'){
                    int count=0;
                    while(s.peek() != '('){
                        s.pop();
                        count++;
                    }
                    if(count<1){
                        return true;//duplicate
                    }
                    else{
                        s.pop();
                    }
                }
                else{//opening
                    s.push(ch);
                }
            }
            return false;
        }

        //Maximum Area in Histogram
        public static void maxArea(int arr[]){
            int maxArea=0;
            int nsr[]= new int[arr.length];
            int nsl[]=new int[arr.length];
            //Next smaller Right 
            Stack<Integer> s= new Stack<>();
            for(int i=arr.length-1; i>=0; i--){
                while(!s.isEmpty() && arr[s.peek()]>= arr[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    nsr[i]= arr.length;
                    //-1
                }
                else{
                    nsr[i]= s.peek();
                    //op
                }
                s.push(i);
            }

            //Next smaller Left
            s= new Stack<>();
            for(int i=0; i<=arr.length-1; i++){
                while(!s.isEmpty() && arr[s.peek()]>= arr[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    nsl[i]= arr.length;
                    //-1
                }
                else{
                    nsl[i]= s.peek();
                    //op
                }
                s.push(i);
            }

            //Current Area: width = j-i-1= nsr[i]-nsl[i]-1
            for(int i=0; i<arr.length; i++){
                int height = arr[i];
                int width= nsr[i]- nsl[i]-1;
                int currArea= height *width;
                maxArea= Math.max(currArea, maxArea);
            }

            System.out.println("Max area is "+maxArea);
        }


    public static void main(String Args[]){
    // String str="abc";
    //     String result=reverseString(str);
    //     System.out.println(result);

        // Stack <Integer> s= new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // pushAtBottom(s, 5);
        // System.out.println(s);
//321
        // reverseStack(s);
        // printStatic(s);
//1->2=>3



// int stocks[] = {100,80, 60,70, 60, 85, 100 };
// int span[]= new int[stocks.length];
// stockSpan(stocks, span);
// for(int i=0; i<span.length; i++){
//     System.out.println(span[i]+" ");
// }
        
// Question no.4
// Next greater Element find out kro
// int arr[] = {6,8,0,1,3};
// int arr1[]={3,2,1,4,3,5,5,7};
//     Stack<Integer> s = new Stack<>();
//     int nxtGreater[]= new int [arr1.length];
// //O(n)
//     for(int i=arr1.length-1; i>=0; i--){
//         //while
//         while(!s.isEmpty() && arr1[s.peek()] <= arr1[i]){
//             s.pop();
//         }
//         //if else
//         if(s.isEmpty()){
//             nxtGreater[i]=-1;
//         }
//         else{
//             nxtGreater[i]= arr1[s.peek()];
//         }
//         //push
//         s.push(i);
//     }
//     for(int j=0; j<nxtGreater.length; j++){
//         System.out.print(nxtGreater[j]+" ");
//     }
//     }

    //You can find out with help of next Greater RIGHT
    // next greater left
    // next greater left 


    //for valid Parentheses
    // String str= "({})[]";
    // System.out.println(isValid(str));

    // String str= " ((a+b))";
    // String str2=" (a-b)";
    // System.out.println(isDuplicate(str2));

    int arr[]={2,4};
    maxArea(arr);  



}
}
