class Solution {
    public int[] productExceptSelf(int[] nums) {
        //int[] res =new int[nums.length];
        backtrack(nums,1,0);
        return nums;
    }
    public int backtrack(int[] nums,int prod, int i){
        if(i == nums.length)
            return 1;
        int ri= backtrack(nums, nums[i]*prod, i+1);
        int t = nums[i];
        nums[i] = ri * prod;
        return ri * t;
    }
}