import java.util.*;
public class check_prime {
    public static boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt(n); i++){
            if (n%i == 0){
            return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println(isPrime(a));

    }
}
