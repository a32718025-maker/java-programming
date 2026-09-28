public class trappwater {
    public class trappingRainwater{
    public static void TrappingRainwater(int h[]){
        int trappWater=0;
        int leftmax[]=new int[h.length];
        int rightmax[]=new int[h.length];
        for(int i=0;i<h.length;i++){
            leftmax[i]=Math.max(h[i],leftmax[i-1]);
           // if(h[i]>max){
           //     max=h[i];
          //  }
          //  leftmax[i]=max;
    }
        for(int i=h.length;i>0;i--){
            rightmax[i]=Math.max(h[i],rightmax[i+1]);

                             // if(h[i]>max){
                            //     rightmax[i]=max;
                              //  }
        } 
        for(int i=0;i<h.length;i++){
        int waterlevel=Math.min(leftmax[i],rightmax[i]);
        trappWater+=(waterlevel-h[i]);
    }
    System.out.print("trapped rainwater"+trappWater);
}
public static void main(String[] args){
    int h[]={4,2,0,6,3,2,5};
    TrappingRainwater(h);
}
}
    
}
