class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        int[] p = new int[nums.length];
        int[] s = new int[nums.length];
        p[0] = 1;
        for(int i=1;i<nums.length;i++){
            p[i] = p[i-1] * nums[i-1];
        }
        s[nums.length-1] = 1;
        for(int i=nums.length-2;i>=0;i--){
            s[i] = s[i+1] * nums[i+1];
        }
        for(int i=0;i<nums.length;i++)
            res[i] = p[i] * s[i];
        return res;
    }
}