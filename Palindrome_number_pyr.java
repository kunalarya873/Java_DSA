import java.util.*;
public class Palindrome_number_pyr {
    public static void main(String Args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1 ; i<=n; i++){
            for(int j=1 ; j<=2*(n-i) ; j++){
                System.out.print(" "); 
            }
            for(int j=i ; j>=1; j--){
                System.out.print(j + " ");
            }
            
            for(int j=2 ; j<= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}