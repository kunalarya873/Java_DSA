import java.util.*;
public class Spiral_matrix {
    public static void printSpiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol ){
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            for(int i=startRow+1; i<=endRow; i++){
                if(startRow == endRow){
                    break;
                }
                System.out.print(matrix[i][endCol]+ " ");
            }
            for(int j=endCol-1; j>=startCol; j--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(matrix[endRow][j] +" ");
            }
            for(int i=endRow-1; i>=startRow; i--){
                System.out.print(matrix[i][startCol]+ " ");
            }
            startCol++;
            startRow++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }
    /*public static void printnumbers(int matrix){
        for(int i=0; i<= matrix.length ; i++){
            for(int j=0; j<=matrix[0].length ; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }*/
    public static void main(String args[]){
        /*Scanner sc=new Scanner(System.in);
        int matrix[][]= new int[3][4];
        int n=matrix.length , m=matrix[0].length;
        for(int i=0; i<n; i++ ){
            for(int j=0; j<m; j++){
                System.out.println("Enter the ("+i+j+") element");
                matrix[i][j]=sc.nextInt();
            }
        }*/
        int matrix[][]={{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        printSpiral(matrix);
    }
}
