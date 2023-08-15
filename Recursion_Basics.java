import java.io.FilterInputStream;

import javax.swing.ToolTipManager;

public class Recursion_Basics {
    public static void printDec(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.print(1 +" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
        
    }
    public static int Factorial(int n){
        int f=1;
        if(n==0){
            return 1;
        }
        f= n*Factorial(n-1);
       // System.out.println(f);
       return f;
    }
    public static int nSum(int n){
        if(n==0){
            return 0;
        }
        int sum= nSum(n-1)+n;
        return sum;
    }
    public static int Fibbonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        int k= Fibbonacci(n-2)+Fibbonacci(n-1);
        return k;
    }
    public static boolean isSorted(int arr[], int i){
        if(i== arr.length -1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }
    public static int firstOccurence(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static int lastOccurence(int arr[], int key, int i){
        if(i == arr.length ){
            return -1;
        }
        int isFound = lastOccurence(arr, key, i+1);
        if(isFound == -1 && arr[i]== key){
            return i;
        }
        return isFound;
    }
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }
    public static int optimizedPower(int a, int n){
        if(n==0){
            return 1;
        }
        int halfPower= optimizedPower(a, n/2);
        int halfPowerSq =  halfPower* halfPower;

        if(n%2 != 0){
            halfPowerSq = a*halfPowerSq;
        }
        return halfPowerSq;
    }


    // Tiling Problem
    public static int tillingProblem(int n){
        // base case
        if(n==0 || n==1){
            return 1;
        }
        // 2xn ka Floor Size
        //vertical Choice
        int fnm1 = tillingProblem(n-1);
        //horizontal Choice
        int fnm2 = tillingProblem(n-2);

        int totWays = fnm1 +fnm2;
        return totWays;
    }

    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar- 'a'] == true){
            //duplicate
            removeDuplicate(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a']= true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static int friendsPairing(int n){
        if(n==1|| n==2){
            return n;
        }
        /*int fnm1= friendsPairing(n-1);
        
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1)*fnm2;
        int totWays= fnm1+pairWays;*/
        return friendsPairing(n-1) + (n-1)*friendsPairing(n-2);
    }

    public static void printBinStrings(int n, int lastPlace, String str){
        /*if(lastPlace == 0){
            printBinStrings(n-1, 0, str.append("0"));
            printBinStrings(n-1, 1, str.append("1"));
        }
        else{
            printBinStrings(n-1, 0, str.append("0"));
        }*/
        if(n == 0){
            System.out.println(str);
            return; 
        }
        printBinStrings(n-1, 0, str+"0"); 
        if(lastPlace ==0){
            printBinStrings(n-1, 1, str+"1");
        }
        
    }
    public static void main(String args[]){
        int n= 5;
        /*printDec(n);
        printInc(n);
        System.out.println();
        System.out.println(Factorial(n));
        System.out.println(nSum(n));*/

        //System.out.println(Fibbonacci(n));
        /*int arr[]= {1,2,3,4,5};
        isSorted(arr, 0);
        System.out.println(isSorted(arr,0));*/

        /*int arr[]= {1,1,4,4,5,5,2,7,8,6,9,3};
        int key=9;
        System.out.println(firstOccurence(arr, key, 0));*/

        /*int arr[] = {1,1,1,1,11,1,11,1,1,1};
        int key =11;
        
        System.out.println(lastOccurence(arr, key, 0));*/


        //System.out.println(power(2, 10));


        //System.out.println(optimizedPower(2,10));
        //System.out.println(tillingProblem(9));


        /*String str ="appnnacollege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);*/

        //System.out.println(friendsPairing(4));
        printBinStrings(4, 0, "");

    }
}