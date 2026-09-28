public class functionFactorial {
    public static void printFactorial(int n){
        if(n<0){
            System.out.println("invalid no.");
            return;
        }
        // factorial of 4 is 4*3*2*1
        int factorial=1; //bcz without this factorial is 0
        for(int i=n; i>=1; i--) {
            factorial=factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
    printFactorial(5);
    }
}
