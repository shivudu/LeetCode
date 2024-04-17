class Solution {
    public int maxProfit(int[] prices) {
        int s =0;
        int e = prices.length -1;
        int min = prices[s];
        int max = 0;
        for(int n: prices){
            max = Math.max(max, n - min);
            min = Math.min(n, min);
        }
        return max;
    }
}