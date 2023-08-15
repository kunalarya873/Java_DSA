import java.util.*;
public class Homework5 {
    public static void reverseArray(int arr[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("About which index do you want rotate the matrix");
        int n=sc.nextInt();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<=i; j++){
                arr[n]=arr[j];
                System.out.print(arr[n]);
            }
        }
    }
    public static void main(String args[]){
        int arr1[]={0,1,2,3,4,5,6,7};
        reverseArray(arr1);
    }
}
