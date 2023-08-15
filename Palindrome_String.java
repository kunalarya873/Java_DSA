import java.util.*;
public class Palindrome_String {
    public static boolean isPalindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            int n=str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }
    public static void main(String args[]){
        String str= "racecar";
        String str2= "noon";
        String str3= "not";
        isPalindrome(str3);
    }
}
