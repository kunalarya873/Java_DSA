import java.util.*;
public class largest_in_array {

    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest= Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest< numbers[i]){
                largest=numbers[i];

            }
            if(smallest>numbers[i]){
                smallest= numbers[i];
            }
        
        }
        System.out.println("Smallest number is " +smallest);
        return largest;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int numbers[]= {1,2,3,4,5};
        System.out.println("Largest number is "+ getLargest(numbers));


    }
}
