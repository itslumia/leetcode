public class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) return 0;
        int maxEndHere = 0;
        int maxTotal = 0;
        for (int i=0; i<prices.length-1; i++) {
            int a = prices[i+1] - prices[i];
            maxEndHere = Math.max(a, maxEndHere+a);
            maxTotal = Math.max(maxTotal, maxEndHere);
        }
        return maxTotal;
    }
}