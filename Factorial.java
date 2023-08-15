
import java.util.*;
public class Factorial {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

    int n= sc.nextInt();

        if(n==0 && n==1){
            System.out.println("1");

        }
        else{
            int factorial=1;
            for(int i=1; i<=n ; i++){
                
                factorial=factorial*i;
            
        }
        System.out.println(factorial);
    }

    }
}


