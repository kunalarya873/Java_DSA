import java.util.*;
public class Zero_One_triangle {
    public static void main(String Args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1 ; j<=i ; j++){
                if((i+j)%2 == 0){
                System.out.print("1");
                }
                else{
                    System.out.print("0");
                }

            }
            System.out.println();
        }

    }
}
