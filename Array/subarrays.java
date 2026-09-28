package Array;

public class subarrays {
public static void  subarray (int arr[]){
    int ts=0;
    int start=0,end=0;
    int maxSum=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){   //time complexity=o(i*j*k) or o(n^3)
            int sum=0;         // space complexity=o(1)
            for(int k=i;k<=j;k++){
                System.out.print(arr[k]+" ");//print subarray
               sum=sum+arr[k];// sum of one subbarray
            }
            
            System.out.println("="+sum);
            if(sum>maxSum){
                maxSum=sum;// find maimum subbray sum
                start=i;
                end=j;
            }
            ts++;
    
        }
        System.out.println();
    }
    System.out.println("total subarrays "+ts); //total sum ofall subarrays
    System.out.println("max subarray sum "+maxSum); //sum of max subarry
    System.out.println("maximum subarray element are:");
    for(int i=start;i<=end;i++){
        System.out.print(arr[i]+" ");//element of max subarry
    }

}
public static void main(String[] args){
    int arr[]={4,5,6,7,8,9};
    subarray(arr);
}    
}
