import java.util.*;
public class Diagonal_Sum_Arr {
    public static void printSum(int matrix[][]){
        int sum=0;
        int sum2=0;
        for(int i=0; i<matrix.length ; i++){
            for(int j=0; j<matrix[0].length ; j++){
                if(i==j){
                    sum +=matrix[i][j];
                }
                else if(i+j==matrix.length -1){
                    sum2 +=matrix[i][j];
}
            }
        }
        System.out.println("The Sum of Primary Diagonal Elements are " + sum);
        System.out.println("The Sum of Secondary Diagonal Elements are " + sum2);

    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        printSum(matrix);
    }
}
