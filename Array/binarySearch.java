package Array;

public class binarySearch {
    public static int search(int numbers[],int key){
        int start=0; 
        int end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;   //time complexity=o(logn), at the end the array size is 1=at value n/2^k
            if(numbers[mid]==key){
                return mid;
            }if(numbers[mid]>key){ // left
                end=mid-1;
            }else{
                start=mid+1;  //right
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int numbers[]={5,6,7,8,9,10,11,12,13};//sorted array
    int key=8;
    int result=search(numbers,key);
    if(result!=-1){
        System.out.println(key+" is found at index "+result);
    }else
   System.out.println( key+" is not found at any index");
    }
}
