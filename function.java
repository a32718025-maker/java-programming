import java.util.*;
public class function{
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int a =sc.nextInt();
    int b =sc.nextInt();//(arguments or actual parameters)written in call
    // call finction
    int sum = calculatesum(a,b);
    System.out.println(sum);
}
    public static int calculatesum(int a, int b) {// (parameters or formal parameters) written in function definition
        int sum=a+b;
        return sum; //return type is int
    } 
}    
    

