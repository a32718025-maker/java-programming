package Array;

public class reverse {
    public static void Reverse(int arr[]){
        int i=0,n=arr.length-1;
        while(i<n){// jab tak last ki value initial sae badi hae
            int change= arr[i];//swapping
            arr[i]=arr[n];
            arr[n]=change;
            i++;
            n--;
        }
    }
public static void main(String[] args ){
    int arr[]={7,8,9,15,18,20,31,41,53};//sorted array
    Reverse(arr);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}
}
//time complexity o(n/2)->o(n) 
//space complexity o(1), variables take constant place in memory