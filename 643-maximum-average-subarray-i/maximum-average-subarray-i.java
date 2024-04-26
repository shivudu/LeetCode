class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<k;i++)
            sum+=nums[i];
        int winMax = sum;
        for(int i=k;i<nums.length;i++){
            sum = sum - nums[i-k] + nums[i];
            winMax = Math.max(winMax,sum);
        }
        return (double) winMax / k;
        
    }
}