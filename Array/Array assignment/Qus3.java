//package Array assignment;

public class Qus3 {
    public static int buyOrSellStocks(int prices[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<prices.length; i++) {
            if(buyPrice < prices[i]) {
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
              buyPrice = prices[i];
            }
           // return maxProfit;
        }
        return maxProfit;
    }
    public static void main (String arg[]) {
        int prices[] = {7,6,4,3,1};
        System.out.println(buyOrSellStocks(prices));
    }
    
}
