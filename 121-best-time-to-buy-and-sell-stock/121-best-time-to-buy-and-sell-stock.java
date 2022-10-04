class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int pro =0;
        int lsf=Integer.MAX_VALUE;
    for(int i=0;i<prices.length;i++){
        if(prices[i]<lsf){
            lsf=prices[i];
        }
        pro =prices[i]-lsf;
        max= Math.max(pro,max);
    }
    return max;
    }
}