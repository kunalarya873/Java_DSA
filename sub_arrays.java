import java.util.*;
public class sub_arrays {
    public static void printSubarrays(int numbers[]){
        int maxSum= Integer.MIN_VALUE;
        int sum=0;

        for(int i=0; i<numbers.length ; i++){
            for(int j=i; j<numbers.length ; j++){
                sum=0;
                for(int k=i ; k<=j ; k++){
                    System.out.print(numbers[k]);
                    sum=numbers[k]+sum;
                     }
                System.out.print("{" + sum + "} ");
            if(maxSum<sum){
            maxSum=sum;
        }
        System.out.print(" ");
    }
            System.out.println();
        }
        System.out.println("Max Sum is "+ maxSum);
    }
    public static void main(String args[]){
        int numbers[]= {1,2,3,4,5,6};
        printSubarrays(numbers);
    }
}
