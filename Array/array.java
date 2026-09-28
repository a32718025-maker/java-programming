package Array;
//linerar seach
public class array {
    public static int linearsearch(int marks[],int key ){ 
        for(int i=0;i<marks.length;i++){
            if(marks[i]==key){
                return i;
            }
        }
        return -1;
    }
    //largest number
public static int largNum(int marks[]){
    int large=marks[0];
    for(int i=0;i<marks.length;i++){
        if(marks[i]>large){
             large=marks[i];
        }
}
return large ;
}

public static void main(String[] args) {
    int marks[]={6,9,4,7,8};
    int key=4;
    int index=linearsearch(marks,key);
    if(index==-1){
        System.out.print(key+"not found");
    }else{
        System.out.println(key+"is found at index"+index);
    }
    System.out.println("largest numm "+largNum(marks));
}
}