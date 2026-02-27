//Best time to buy and sell stocks
public class sellStock {
    public static int maxProfit(int[] prices){
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int price:prices){
            if(price<minprice){
                minprice=price;
            }
            else if(price-minprice>maxprofit){
                maxprofit=price-minprice;
            }
        }
        return maxprofit;
    }
}
/*
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

prices = [7,1,5,3,6,4]
minprice = ∞
maxProfit = 0
7 => 7 < ∞ → yes
minprice = 7
minprice = 7
maxProfit = 0
1 => 1 < 7 → yes
minprice = 1
minprice = 1
maxProfit = 0
5 => 5 < 1 ? → no
profit = 5 - 1 = 4
4 > 0 → yes
maxProfit = 4
minprice = 1
maxProfit = 4
3 => 3 < 1 ? → no
profit = 3 - 1 = 2
2 > 4 ? → no
6 => 6 < 1 ? → no
profit = 6 - 1 = 5
5 > 4 → yes
maxProfit = 5
minprice = 1
maxProfit = 5
4 => 4 < 1 ? → no
profit = 4 - 1 = 3
4 < 1 ? → no
profit = 4 - 1 = 3
return 5
*/
