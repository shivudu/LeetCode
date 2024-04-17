class Solution {
    public int removeDuplicates(int[] nums) {
        int m = nums.length;
        for(int i=0;i<m;i++){
            if(i+1 < m && nums[i] == nums[i+1]){
                int t = i;
                int c = 0;
                while(t+1<m && nums[t] == nums[t+1]){
                    if(c++ > 0){
                        shiftLeft(nums,t);
                        m--;
                        t--;
                    }
                    t++;
                }
            }
        }
        return m;
    }
    private void shiftLeft(int[] nums,int indx){
        for(int i=indx;i<nums.length-1;i++)
            nums[i] = nums[i+1];
    }
}