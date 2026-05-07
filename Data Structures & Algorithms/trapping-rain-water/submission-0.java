class Solution {
    public int trap(int[] height) {
        if(height==null || height.length==0)
          {  return 0;}
       int n=height.length;
       int water=0;

       for(int i=0;i<n;i++){
        int leftmax=height[i];
        int rightmax=height[i];

        for(int j=0;j<i;j++){
            if(height[j]>leftmax){
                leftmax=height[j];
            }
        }
         for(int j=i+1;j<n;j++){
            if(height[j]>rightmax){
                rightmax=height[j];
            }
        }
        water+=Math.min(leftmax,rightmax)-height[i];
        
       } 
       return water;
    }
}
