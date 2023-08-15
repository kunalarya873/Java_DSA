
public class prefix_sum_array {
    public static void printSubarrays(int numbers[]){
    int maxSum= Integer.MIN_VALUE;
        int sum=0;
        int prefix[]= new int[numbers.length];
        prefix[0]=numbers[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i]= prefix[i-1]+numbers[i];
        }
        for(int i=0; i<numbers.length ; i++){
            for(int j=i; j<numbers.length ; j++){
                sum=i ==0 ? prefix[j]: prefix[j]- prefix[i-1];
            if(maxSum<sum){
            maxSum=sum;
        }
        
    }
            
        }
        System.out.println("Max Sum is "+ maxSum);
    }
    public static void main(String args[]){
        int numbers[]= {1,2,3,4,5,6};
        printSubarrays(numbers);
    }
}
