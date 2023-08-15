public class Bit_Manipulation {
    public static void Intro(int i){
        //AND operaor
        /*
         * 
         */
        System.out.println("AND " + (5&6));
        

        // OR operator
        /*
         * 
         */

        System.out.println("OR " +(5|6));
        
        
        //xor oerator
        /*
         * 0^0=0
         * 0^1=1
         * 1^0=0
         * 1^1=0
         */
        System.out.println("XOR " +(5^6));
        
        
        // tilt ~
        /*
         * ~0=1
         * ~1=0
         */
        System.out.println("Tilt " +(~5));
        
        
        // Binary left Shif<<
        System.out.println(5<<2);


        // Binary Right Shift>>
        System.out.println(5>>2);
    }


    public static void oddOrEven(int n){
        int bitMask=1;
        if((n & bitMask) ==0){
            System.out.println("The number is Eve");

        }
        else{
            System.out.println("The number is Odd");
        }
    }


    public static int getIthBit(int n, int i){
        int bitMask=1<<i;
        if((n & bitMask) == 1){
            return 0;
        }
        else{
            return 1;
        }
    }


    public static int setithBit(int n, int i){
    int bitMask = 1<<i;
    return n | bitMask;
    }


    public static int clearBit(int n, int i){
        int bitMask = ~(1<<i);
        return n& bitMask;
    }


    public static int updateIthBit(int n, int i, int newBit){
        if(newBit == 0){
            return clearBit(n,i);
        }
        else {
            return setithBit(n, i);
        }
    }


    public static int clearBitMask(int n, int i){
        int bitMask = (~0)<<i;
        return n & bitMask;
    }


    public static int clearRange(int n, int i ,int  j){
        int a=((~0) << (j+1));
        int b= (1<<i) -1;
        int bitMask= a|b;
        return n& bitMask;
    }
    public static boolean isPowerofTwo(int n){
        return (n&(n-1))==0;
    }


    public static int countsetBits(int n){
        //set bits means number of times 1 is in the number(n)
        int count =0;
        while(n > 0){
            if((n & 1) != 0){
                //check our Lsb
                count++;
            }
            n= n>>1;
        }
        return count;
    }
    // Fast Exponesitation
    public static int Fast_Exponesitation(int a,int n){
        int ans =1;
        while(n>0){
            if((n&1) !=0){//check lsb
                ans =ans *a;
            }
            a=a*a;
            n= n>>1;
        }
        return ans;
    }

    public static void main(String args[]){
        int n=15; 
        //oddOrEven(n);
        //System.out.println(getIthBit(n, 3));
        //System.out.println(setithBit(n,3));
        //System.out.println(clearBit(10, 1));
        //System.out.println(clearBit(n, 1));
        //System.out.println(clearRange(10, 2, 4));
        //System.out.println(isPowerofTwo(5));
        //System.out.println(countsetBits(n));
        System.out.println(Fast_Exponesitation(199, 3));
        }
    }
