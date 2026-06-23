class Solution {
    public int maxProfit(int[] prices) {
        // int left=0;
        // int bal=0;
        // int min=0;
        // int max=0;
        // int cMin=0;
        // int cMax=0;
        // for(int right=0; right<prices.length; right++){
        //    if(prices[right]>prices[left]){
        //     min=prices[left];
        //      max=prices[right];
        //     if(cMin<min){
        //         min=cMin;
        //     }
        //     if(cMax>max){
        //         max=cMax-max;
        //     }
           
        //     bal-=min;
        //     bal+=max;
        //     cMin=min;
        //     cMax=max;
        //    }

        //    if(right-left>=2){
        //     left++;
        //    }
        // }
        // return bal;
        int minPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int p: prices){
            minPrice=Math.min(p, minPrice);
            maxProfit=Math.max(maxProfit, p-minPrice);
        }
        return maxProfit;
    }
}
