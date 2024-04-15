class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length-1, target, nums);
    }
    private int binarySearch(int s, int e, int t, int[] nums){
        int m = s + (e-s)/2;
        if(s <= e){
            if(nums[m] == t)
                return m;
            if(nums[m] >= nums[s]){
            if(t >= nums[s] && t<= nums[m] )
                return binarySearch(s,m-1, t, nums);
            else
                return binarySearch(m+1, e, t, nums);
            }
            else{
            if(t >= nums[m] && t<=nums[e])
                return binarySearch(m+1, e, t, nums);
            else
                return binarySearch(s, m-1, t, nums);
            }
        }
        return -1;
    }
}