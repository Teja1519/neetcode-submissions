class Solution {

   

    public int maxProfit(int[] prices) {
    //     boolean buy=false;
    //     int profit=0;
    //    for(int i=0, j=1; j<prices.length; i++, j++){
    //     if(prices[i]<prices[j]){
    //         if(buy==false){
    //          buy=true;
    //         profit-=prices[i];
    //         }
    //     }else{
    //      if(buy==true){
    //          buy=false;
    //         profit+=prices[i];
    //     }
    //    }
      
    // }
    // if(buy){
    //     buy=false;
    //         profit+=prices[prices.length-1]; 
    // }
    //  return profit;
    // }
    int profit=0;
    for(int i=1; i<prices.length; i++){
        if(prices[i]>prices[i-1])
            profit+=prices[i]-prices[i-1];
    }
    return profit;

    }   
}