class Solution {
    public int maxProfit(int[] prices) {
        if(prices== null || prices.length<2){
            return 0;
        }
        int min = prices[0];
        int maxP = 0;
        for(int p:prices){
            if(p<min){
                min = p;
            }
            else{
                maxP = Math.max(maxP , p-min);
            }
        }
        return maxP;
    }
}