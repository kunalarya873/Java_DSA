public class Homework4 {
    //Arrays ka ques1
    public static void sameElement(int arr[]){
        for(int i=0; i<arr.length ; i++){
            for(int j=i+1 ; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println("True");
                    break;
                }
                
                else{
                    System.out.println("False");
                    break;
                }
                
            }
            break;
        }
    }
    public static void main(String args[]){
        int arr1[]= {1,2,3,4,5,6};
        int arr2[]= {1,1,2,3,3,4};
        sameElement(arr2);
    }
}
