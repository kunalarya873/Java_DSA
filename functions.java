import java.util.*;
public class functions {
    public static void printHelloWorld() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }
    public static int calculateSum(int a, int b){
        int sum=a+b;
        return sum;
        

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        
       
        int sum=calculateSum(a,b);
        System.out.println("Sum is :" + sum);



        // swap value exchanger

        int x=5;
        int y=10;
        // swap
        int temp= x;
        x=y;
        y=temp;
        System.out.println("x= " +x);
        System.out.println("y= " +y);
        

    }
}
