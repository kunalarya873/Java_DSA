import java.util.*;
public class hollow_rectangle_pattern {
    public static void hollow_rectangle(int totRows, int totCols){
        for(int i=1; i<=totRows; i++){
            for(int j=1; j<=totCols; j++){
                if(i==1  || i==totRows || j==1 || j==totCols){
                    System.out.print("*");

            } else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
    public static void main(String Args[]){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        hollow_rectangle(4, 5);



    }
}
