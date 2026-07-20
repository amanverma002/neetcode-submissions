class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];

        int maxp=0;

        for(int i=1; i<prices.length; i++){
            if(prices[i]<minprice){
                minprice=prices[i];
                  
            }
            int cost=prices[i]-minprice;
            if(cost>maxp){
                maxp=cost;
            }
        }
        return maxp;

    }
}
