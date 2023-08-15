import java.util.*;

public class Binomial_coefficient {
    public static int factorial(int n){
        int f=1;
            for(int i=1; i<=n ; i++){
                f=f*i;
            }
            return f;
    }
    public static int coefficient (int n, int r){
       int fact_n = factorial(n);
       int fact_r= factorial(r);
       int fact_nmr= factorial(n-r);
       int binCoeff= fact_n/(fact_r*fact_nmr);

       return binCoeff;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("N is ");
        int a=sc.nextInt();
        System.out.println("R is ");
        int b=sc.nextInt();

        System.out.println(coefficient(a,b));
    }
    
}