class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int prod=1;
            for(int j=0;j<i;j++){
                prod=prod*nums[j];
            }
            for(int k=i+1;k<nums.length;k++){
                prod=prod*nums[k];
            }
            res[i]=prod;
        }
        return res;
    }
}  
