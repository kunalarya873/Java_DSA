import java.util.*;
public class Character_pattern {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        char ch='A';
        for(int i=0 ; i<=n ; i++){
            for(int j=1 ; j<= i ; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    }
}
