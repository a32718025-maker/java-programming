public class bincoff {
    public static int factorial(int n) {
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial=factorial*i;
        }
        return factorial; 
    }
        public static int binomial(int n,int r) {
           int fact_n = factorial(n);
           int fact_r = factorial(r);
           int fact_nr = factorial(n-r);
           int bin = fact_n/(fact_r * fact_nr);
           System.out.println(bin);
           return bin;
        }
        public static void main(String[] args) {
            binomial(5,4);
        }
        }

    
