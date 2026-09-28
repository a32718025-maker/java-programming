public class bintodec {
    public static void todec(int binnum){
        int a=binnum;
        int pow=0; 
        int decnum=0;
        while(binnum>0){ //value jab jero ho jaye uske badd value print na ho
     int ld=binnum%10;
      decnum=decnum+(ld*(int)Math.pow(2,pow));//math.pow gives value in double
     pow++;
     binnum=binnum/10;
        }
     System.out.println("decimal of"+a+"is"+decnum);
    }
    public static void decTobin(int n) {
        int mynum=n;
        int binum=0;
        int pow=0;
        while(n>0){
           int rem=n%2;
           binum=binum+(rem*(int)Math.pow(10,pow));
           pow++;
           n=n/10;
        }        System.out.println("binary no. of" +mynum+ " = "+binum);  
    }   
    public static void main (String[] args){
        todec(1111);
        decTobin(5);

    }

    } 
    

