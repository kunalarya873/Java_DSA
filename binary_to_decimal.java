public class binary_to_decimal {
    public static void bintodec(int bitnum){
        int pow=0;
        int decnum=0;
        while(bitnum>0){
                int lastdigit=bitnum%10;
                decnum=decnum + (int)(lastdigit*Math.pow(2,pow));
                pow++;
                bitnum=bitnum/10;
        }
        System.out.println(decnum);
    }
    public static void main(String args[]){
       bintodec(10);
        
    }
}
