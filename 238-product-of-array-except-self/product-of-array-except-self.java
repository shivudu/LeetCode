class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res =new int[nums.length];
        backtrack(nums,1,0,res);
        return res;
    }
    public int backtrack(int[] nums,int prod, int i,int[] res){
        if(i == nums.length)
            return 1;
        int ri= backtrack(nums, nums[i]*prod, i+1,res);
        res[i] = ri * prod;
        return ri * nums[i];
    }
}