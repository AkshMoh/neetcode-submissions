class Solution {
    public int maxArea(int[] heights) {
        List<Integer> res=new ArrayList<>();
        int water=0;
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                water=Math.min(heights[i],heights[j])*(j-i);
                res.add(water);
            }
        }
        Collections.sort(res);
         return (res.get(res.size() - 1));
    }
}
