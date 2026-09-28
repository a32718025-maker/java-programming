public class dectobin {
    public static void decTobin(int n) {
        int mynum=n;
        int binum=0;
        int pow=0;
        while(n>0){
           int rem=n%2;
           binum=binum+(rem*(int)Math.pow(10,pow));
           pow++;
           n=n/2;
        }
        System.out.println("binary no. of" +mynum+ " = "+binum);  
}
public static void main(String[] args){
    decTobin(7);
}
}  
