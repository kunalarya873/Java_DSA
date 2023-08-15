import java.util.*;
public class Homework7 {
    public static void Ques1(String str){
        int sum=0, sumA=0, sumE=0, sumI=0, sumO=0, sumu=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a'){
                sum++;
                sumA++;
            }
            else if(str.charAt(i) == 'e'){
                sum++;
                sumE++;
            }
            else if(str.charAt(i) == 'i'){
                sum++;
                sumI++;
            }
            else if(str.charAt(i) == 'o'){
                sum++;
                sumO++;
            }
            else if(str.charAt(i) == 'u'){
                sum++;
                sumu++;
            }
        }

        if(sumE>1){
            System.out.println("The number of times vowel E is repeated" + sumE);

        }        if(sumA>1){
            System.out.println("The number of times vowel A is repeated" + sumA);

        }
        if(sumE>1){
            System.out.println("The number of times vowel E is repeated" + sumE);

        }
        if(sumI>1){
            System.out.println("The number of times vowel I is repeated" + sumI);

        }
        if(sumO>1){
            System.out.println("The number of times vowel O is repeated" + sumO);

        }
        if(sumu>1){
            System.out.println("The number of times vowel U is repeated" + sumu);

        }
        else{
            System.out.println("The total numbers of vowels present int the string is "+ sum);
        }

    }
    public static void main(String args[]){
        String str="kunal arya iiiii";
        Ques1(str);
    }l
}
