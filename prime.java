 public class prime {
    public static void main(String[] args) { 
        int n=8;
        boolean a = true;
        if(n<=1){
            a = false;
        }
        else{
        for(int i=2; i<=Math.sqrt(n); i++) { //or i<=n/2,i<=n
        if(n % i == 0)
        a=false;
        break;
        }
    }
    if(a){
        System.out.println(n+" is prime");
    }else{
        System.out.println(n+" is not prime");

    }
    }
}

