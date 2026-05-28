class Solution {
    public int maxProfit(int[] prices) {
    int n=prices.length;
   int maxprofit=0;
     for (int i=0;i<n;i++)  {
         int profit=0;
        for(int j=i+1;j<n;j++){
         profit=Math.max(prices[j]-prices[i],profit);
        }
        maxprofit=Math.max(maxprofit,profit);
     }
     return maxprofit; 
    }
}
