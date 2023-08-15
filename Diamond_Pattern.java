import java.util.*;
public class Diamond_Pattern {
    public static void main(String Args[]){
         Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i =0 ; i<=n; i++){
            for(int j=0; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int j=0 ; j<=2*(i-1) ; j++){
                System.out.print("*");

            }
            System.out.println();
        }
        for (int i =n ; i>=1; i--){
            for(int j=0; j<=n-i ; j++){
                System.out.print(" ");
            }
            for(int j=0 ; j<=2*(i-1) ; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
