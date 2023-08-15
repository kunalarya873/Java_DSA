import java.util.*;
public class linear_search {
    public static int linearSearch( int numbers[], int key ,int sum) {
        
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                sum+=i;
                return 1;
                
            }
        }
        return 0;
    }

    public static void main(String args[]){
        int numbers[]= {2, 4 , 6 ,8 , 10, 12, 14};
        int key=10;
        int sum=0;
        if(linearSearch(numbers,key,sum)==1){
        System.out.println("The key is found, at an index of "+sum);
        }
        else{
            System.out.println("The key is not found");
        }
    }
}
k