public class primeFunctions {
    public static boolean prime(int n) {
        boolean isprime=true;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0){
                isprime=false;//return false;
            }
        }
            return isprime; //return true
        }
        public static void primeInRange(int n) {
            for(int i=1;i<=n;i++){
                if(prime(i)){
                    System.out.println(i+" ");
                }
            }
        }
        public static void main(String[] args){
            System.out.println(prime(9));
            if(prime(9)){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
            primeInRange(100);
            }
    

        }
    
