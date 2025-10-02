// In Java, class names cannot contain hyphens. They should use CamelCase.
class BestTimeToSellStock {

    public int maxProfit(int[] prices) {
        // If the array is empty or has only one element, no profit can be made.
        if (prices == null || prices.length < 2) {
            return 0;
        }

        // Initialize minPrice to the price on the first day.
        int minPrice = prices[0];
        // Initialize maxProfit to 0, as profit cannot be negative.
        int maxProfit = 0;

        // Start iterating from the second day.
        for (int i = 1; i < prices.length; i++) {
            // Check if we found a new lower price to buy
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // Check if selling today gives a better profit
                int potentialProfit = prices[i] - minPrice;
                if (potentialProfit > maxProfit) {
                    maxProfit = potentialProfit;
                }
            }
        }
        return maxProfit;
    }

    // The main method to run and test the code
    public static void main(String args[]) {
        // 1. Create an instance of the class
        BestTimeToSellStock stockTrader = new BestTimeToSellStock();

        // 2. Create a sample input array of prices
        int[] prices = {7, 1, 5, 3, 6, 4};

        // 3. Call the maxProfit method with the prices array and store the result
        int result = stockTrader.maxProfit(prices);

        // 4. Print the result
        System.out.println("The maximum profit is: " + result); // Expected output: 5
    }
}