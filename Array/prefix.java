package ARRAY;

public class prefix {
public static void Prefix(int arr[]) {
    for(int i=0;i<arr.length;i++){
        int sum=0;
        for(int j=0;j<=i;j++){//time 
            System.out.print(arr[j]+" " );
            sum=sum+arr[j];
        } 
            System.out.print("="+sum + " ");
          System.out.println();  
        }
    }
    public static void main(String[] args){
        int arr[]={1,-2,6,-1,3};
        Prefix(arr);
    }

}
