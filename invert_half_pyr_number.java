import java.util.*;
public class invert_half_pyr_number {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1; i<=n ; i++){
            for(int j=1 ; j<=n+1-i ; j++){
                System.out.print(j);
            }
            System.out.println();

        }

    }
}
