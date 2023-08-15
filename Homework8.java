public class Homework8 {
    public static int Ques1(int a){
        int ans =1;
        while(a>0){
            if((a&1) != 0){
                ans=ans*a;
            }
            a=a*a;
            a=a>>1;
        }
        return ans;
    }

    public static void main(String args[]){
        int n=5;
        //System.out.println(Ques1(n));
        System.out.println();


    }
}
