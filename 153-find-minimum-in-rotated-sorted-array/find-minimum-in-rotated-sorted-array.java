class Solution {
    public int findMin(int[] nums) {
        return bSearch(0, nums.length-1, nums[0] < nums[nums.length-1] ? nums[0] : nums[nums.length-1], nums);
    }
    private int bSearch(int s, int e, int min , int[] nums){
       int m = s + (e-s)/2;
        if(s <= e){
             //Sorted left side
            if(nums[s] <= nums[m]){
                if(nums[s] < min)
                    min = nums[s];
                return bSearch(m+1, e, min, nums);
            }
            //Sorted right side
            else{
                if(nums[m] < min)
                    min = nums[m];
                return bSearch(s, m, min, nums);
            }
        }
        return min;
    }
}