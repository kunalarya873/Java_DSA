import java.util.*;
public class prime_number_function {
    public static boolean isPrime(int n){
        for(int i=2;i<=n-1; i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
}
    public static void main(String args[]){
        
    Scanner sc= new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println(isPrime(a));


}
}