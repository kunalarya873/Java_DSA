import java.util.*;
public class Toppling {
    public static void toUpperCase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length() ; i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb);
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String k = " My name is kUnal ARYA";
        toUpperCase(k);
    }
}
// Isme proper Toppling krke dekhna