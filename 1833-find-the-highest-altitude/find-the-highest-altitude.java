class Solution {
    public int largestAltitude(int[] gain) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int n:gain){
            sum += n;
            max = Math.max(sum,max);
        }
        return max<0 ? 0 : max;
    }
}