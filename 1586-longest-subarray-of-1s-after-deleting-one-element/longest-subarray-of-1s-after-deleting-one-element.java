class Solution {
    public int longestSubarray(int[] nums) {
        int k=1;
        int left = 0, right;
        for(right=0;right<nums.length;right++){
            if(nums[right] == 0)
                k--;
            if(k<0 && nums[left++] == 0)
                k++;
        }
        return right - left-1;
    }
}