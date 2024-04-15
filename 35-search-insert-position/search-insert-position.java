class Solution {
    public int searchInsert(int[] nums, int target) {
        return bSearch(0, nums.length-1, target, nums);
    }
    private int bSearch(int s, int e, int target, int[] nums){
        int m = s + (e-s)/2;
        if(s <= e){
            if(nums[m] == target)
                return m;
            if(nums[m] > target)
                return bSearch(s, m-1, target, nums);
            return bSearch(m+1, e, target, nums);
        }
        return s;
    }
}