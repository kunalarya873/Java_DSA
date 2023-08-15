import java.util.*;

public class Homework12 {
// public static int Solution(int arr[]){
//     Stack<Integer> intStack = new Stack<>();
//     int temp[] = new int[arr.length];
//     int nsl[]= new int[arr.length];
//     //next smaller number from 1
//     for(int i=0; i<arr.length-1; i++){
//         while(intStack.isEmpty() && arr[intStack.peek()]>=arr[i]){
//             intStack.pop();
//         }
//         if(intStack.isEmpty()){
//             intStack.push(max(arr[]));
//         }
//         }
//     }
    static int BalancedPartition(String str, int n){
        if (n == 0)return 0;
        int r = 0, l = 0;
        int ans = 0;
        for(int i = 0; i < n; i++){
            if (str.charAt(i) == 'R'){
                r++;
            }else if (str.charAt(i) == 'L'){
                l++;
            }if (r == l){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        String str = "LLRRRLLRRL";
        int n = str.length();
        System.out.print(BalancedPartition(str, n) + "\n");
    }
}


    