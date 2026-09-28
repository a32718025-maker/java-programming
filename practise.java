public class practise { 
    public static float avrg(float n1,float n2,float n3){
        float average=(n1+n2+n3)/3;
        return average;
    }
    public static boolean even(int n){
        boolean iseven=false; 
        if(n%2==0){
             iseven=true;
        }
        return iseven;
    }  
    public static int palindrome(int n){
       int n1=n;
       while(n>0){
       int rem=n%10;
       int n2=n2+rem*10;
       n=n/10;
    if(n2==n1){
        System.out.println(n1+"is palindrome");
    }else{
        System.out.println(n1+"is not a palindrome");
    }
}
}

    public static void main(String[] args){
        System.out.println(avrg(7,4,5));
        System.out.println(even(4));
        palindrome(121);
    } 
    
}
