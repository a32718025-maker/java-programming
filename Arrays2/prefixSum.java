

public class prefixSum {
    public static void maxSubArraySum(int arr[]){
        int prefix[]=new int[arr.length];//forming new array 
        int maxsum=Integer.MIN_VALUE; 
        int sum=0;
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i]; // i  does not starts from 0 bcuz i-1=0-1=-1,thus no element exist 
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){  //time complexity ->0(n^2)
               sum=(i==0)?prefix[j]:prefix[j]-prefix[i-1];
               System.out.print(sum);
                if(maxsum<sum){
                    maxsum=sum;        
                }
            }

        }  
            System.out.println("maxsum "+maxsum);
        }       
public static void main(String[] args){
    int arr[] ={1,-2,6,-1,3};
    maxSubArraySum(arr);
}
    
}
