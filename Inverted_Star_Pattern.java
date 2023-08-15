import java.util.*;
public class Inverted_Star_Pattern {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Give me A Number ");
        int n= sc.nextInt();
        for(int i=0; i<n; i++){
            for (int j=0 ; j<n-i+1 ; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        
    }
}
