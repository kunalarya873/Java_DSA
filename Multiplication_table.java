import java.util.*;

public class Multiplication_table {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int f;

        for (int i=1 ; i<=10 ; i++){
            f=i*n;
            System.out.println( f);
        }

    }
}
        

