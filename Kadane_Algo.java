import java.util.*;
public class Kadane_Algo {
    public static void kadan(int numbers[]){
        int ms= Integer.MIN_VALUE;
        int cs=0;
        for(int i=0; i<numbers.length ; i++){
            cs=cs+numbers[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("Our max Sub array sum is " + ms);
    }
    public static void main(String args[]){
        int numbers[]= {1,-3,2,-5,3,-6,-7,-8};
        kadan(numbers);
    }
}