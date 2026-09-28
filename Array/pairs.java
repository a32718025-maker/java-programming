package Array;

public class pairs {
    public static void pair(int arr[]){
int n=arr.length;
for(int i=0;i<n;i++){//time complexity->(n*n)& space complexiy->o(1)(constant space)bcz sirf variables ue ho rhe hae i,j,n;
    //space complexity o(n)-> agr [array/list] ko store kra kar print kar rhe hae ,in recursive function also
  
    // for(int j=0;j<n;j++)->wrong bcz we want forward no. pairs only
   for(int j=i+1;j<n;j++){

     //  System.out.print(arr[i],arr[j]);//this method does not accept two integers as arguments
       System.out.print("("+arr[i]+","+arr[j]+")");
    }
    System.out.println(); //to do next loop of i in another line
}
    }
public static void main(String[] args){
    int arr[]={5,9,1,0,7,2,3};
    pair(arr);
}   
}
//Q->how to find total no. of pairs 
//Ans->n(n+1)/2
