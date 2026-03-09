// Problem: Best Time to Buy and Sell Stock
// Concept: Greedy Algorithm, Array Traversal

// Description:
// Given an array prices where prices[i] is the price of a stock on the ith day. You want to maximize your profit by choosing a single day to buy one stock  and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction.
// If no profit can be achieved, return 0.

// Example:
// Input:  [7, 1, 5, 3, 6, 4]
// Output: 5
//
// Explanation:
// Buy on day 2 at price = 1
// Sell on day 5 at price = 6
// Profit = 6 - 1 = 5

// Approach:
// - Initialize buyPrice with a very large value (Integer.MAX_VALUE).
// - Traverse the prices array.
// - If the current price is greater than the buyPrice:
//      Calculate profit = prices[i] - buyPrice.
//      Update maxProfit if the profit is larger.
// - Otherwise update buyPrice with the current price.
// - Continue until the end of the array.
// - Print the maximum profit.

// Time Complexity: O(n)
// Space Complexity: O(1)

public class BuySellStock {
  public static void buySellStocks(int prices[]) {
    int buyPrice = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int i = 0; i < prices.length; i++) {
      if (buyPrice < prices[i]) {
        int profit = prices[i] - buyPrice;
        maxProfit = Math.max(maxProfit, profit);
      } else {
        buyPrice = prices[i];
      }
    }
    System.out.println(maxProfit);
  }

  public static void main(String[] args) {
    int prices[] = { 7, 1, 5, 3, 6, 4 };
    buySellStocks(prices);
  }
}
