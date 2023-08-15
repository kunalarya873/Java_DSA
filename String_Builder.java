public class String_Builder {
    public static void main(String args[]){
        StringBuilder sh=new StringBuilder("");
        for(char i='a'; i<='z'; i++){
            sh.append(i);
        }
        System.out.print(sh);
    }
}
