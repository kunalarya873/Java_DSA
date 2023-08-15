import java.util.*;

public class factorial_by_function {
    public static int factorial(int f){
        int n=1;
            for(int i=1; i<=f ; i++){
                n=n*i;
            }
            return n;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=factorial(a);
        System.out.println("factorial is " +  b);

    }
}
