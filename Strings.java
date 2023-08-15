import java.util.*;
public class Strings {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i) +" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        /*char arr[]= {'a' , 'b', 'c', 'd'};
        String str= "abcd";
        String str2= new String(("xyz@#1234"));
        Scanner sc=new Scanner(System.in);
        String name;
        name= sc.nextLine();

        System.out.println(name);
        String Fullname=" Kunal Arya";
        System.out.println(Fullname.length());*/
        
        // Concatenation--
        /*String firstname="Kunal";
        String lastname="Arya";
        String Fullname= firstname +" "+ lastname;
        System.out.println(firstname + " " + lastname);
        printLetters(Fullname);*/
        String s1= "Tony";
        String s2="Tony";
        String s3=new String("Tony");
        if(s1==s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(s1==s3){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        if(s1.equals(s3)){
        System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }


    }
}
