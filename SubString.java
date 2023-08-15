public class SubString {
    public static String substring(String str,int si, int ei){
        String substr ="";
        for(int i=si ; i<ei ; i++){
            substr += str.charAt(i);
        }
        return substr;
}

    public static void main(String args[]){
                     String a1= "HelloWorld";
/*ShortCut*/         System.out.println(a1.substring(0,5));
        /*substring(a1, 1, 9);
        System.out.println(substring(a1, 1, 9));*/
    }
}
