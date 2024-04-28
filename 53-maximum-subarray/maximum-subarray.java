class Solution {
    public int maxSubArray(int[] nums) {
        int curr_sum = 0;
        int res_max_sum = Integer.MIN_VALUE;
        for(int n:nums){
            curr_sum = Math.max(n,curr_sum + n);
            res_max_sum = Math.max(res_max_sum, curr_sum);
        }
        return res_max_sum;
    }
}