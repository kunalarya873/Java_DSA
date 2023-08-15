import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class tempCodeRunnerFile {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        int hundereds= (int)payment%1000;
        int thou= (int)payment/1000;
        double decimal= payment- (int)payment;
        int p= (int)decimal;
        String str1="",str2="",str3="",str4="123";
        
        while(thou%100!=0){//for us
            str1=Integer.toString(thou%100);
            str1+=",";
        }
        //str1.reverse();
        str1=str1+Integer.toString(hundereds)+Double.toString(decimal);
        
        while(thou%100!=0){//for rupees
        str2=Integer.toString(thou%100);
            str2+=",";
        }
        //str2.reverse();
        str2=str2+Integer.toString(hundereds)+Double.toString(decimal);
        while(thou%100!=0){//for china
        str3=Integer.toString(thou%100);
            str3+=",";
        }
        //str3.reverse();
        str3=str3+Integer.toString(hundereds)+Double.toString(decimal);
        while(thou%100!=0){//for france
        str4=Integer.toString(thou%100);
            //str4+=",";
        }
        //str4.reverse();
        str4=str4+Integer.toString(hundereds)+"."+Integer.toString(p);
        // Write your code here.
        String us= "$"+str1;
         String india= "Rs."+str2;
          String china= "￥"+str3;
           String france= str4+"€";
            
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
    