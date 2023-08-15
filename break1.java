import java.util.*;
public class break1 {
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        do {
            System.out.println("enter your number");
            int n=sc.nextInt();
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
        System.out.println("you just entered the multiple of 10");

    }
    
}
