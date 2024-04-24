class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length < 2)
            return 0;
        int res = 0;
        //Insertion sort
        Arrays.sort(nums);
        int max = nums[1] - nums[0];
        for(int i=nums.length-1;i>0;i--){
            max = Math.max(max, nums[i]-nums[i-1]);
        }
        return max;
    }
}