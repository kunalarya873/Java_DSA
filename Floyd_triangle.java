import java.util.*;
public class Floyd_triangle {
    public static void main(String Args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int counter=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter);
                System.out.print(" ");
                counter++;
            }
            System.out.println();

        }

    }
}
