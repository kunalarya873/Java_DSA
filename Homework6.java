public class Homework6 {
    public static void Ques1(int matrix[][], int key){
        int sum=0;
        for(int i=0; i<matrix.length ; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==key){
                    sum++;
                }
            }
        }
        System.out.println("Number of times key repeated is "+ sum);

    }
    public static void Ques2(int matrix[][]){
        int sum=0;
        for(int i=0; i<matrix[0].length; i++){
            sum+=matrix[1][i];
        }
        System.out.println("the sum of second row is "+ sum);

    }
    public static void Ques3(int matrix[][]){
        int temp[][]=new int[3][3];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
               temp[j][i]= matrix[i][j];
            }
        }
        for(int i=0; i<temp.length; i++){
            for(int j=0; j<temp[0].length; j++){
                System.out.print(temp[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int matrix[][] = {{1,2,3}, {4,5,6}, {1,0,1}};
        int key = 1;
        //Ques1(matrix, key);
        //Ques2(matrix);
        Ques3(matrix);
    }
}
