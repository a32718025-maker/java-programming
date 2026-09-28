

public class kadanes {
    public static void maxsubarraysum(int arr[]){
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];          // time complexity->0(n),space complexity->0(1)
            if(sum<0){
                sum=0;
           }
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        System.out.println( "maximum subarray sum "+maxsum);
    }
    public static void main(String args[]){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        maxsubarraysum(arr);
    }
    
}
