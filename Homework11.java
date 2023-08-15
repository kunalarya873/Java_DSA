import java.util.*;
public class Homework11 {
    public static String task(String str){
        Stack<Integer> integerstack = new Stack<>();
        Stack<Character> stack= new Stack<>();
        String temp= "";
        String result= "";
        int a=0;
        String newStr= "";
        for(int i=0; i<str.length(); i++){
            int count =0;
            if(str.isEmpty()){
                System.out.print("String is Empty");
            }
            if(Character.isDigit(str.charAt(i))){
                while (Character.isDigit(str.charAt(i)))
                {
                    count = count * 10 + str.charAt(i) - '0';
                    i++;
                 }
        i--;
             integerstack.push(count);

            }
            else if(str.charAt(i)=='['){
                stack.push(str.charAt(i+1));
            }
            else if(str.charAt(i)== ']'){
                i++;
            }
            for(int b=0; b<=count; b++){
                newStr= newStr+stack.pop();
            }
        }
        return newStr;
        
        }
    
    public static void main(String Args[]){
        String str= new String();
        str="2[we]";
        task(str);

    }
}
