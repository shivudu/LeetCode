class Solution {
    public int jump(int[] nums) {
       int jumps = 0;
       int e = 0;
       int longest = 0;
       for(int i = 0;i<nums.length-1;i++){
        longest = Math.max(longest, i+nums[i]);
        if(i == e){
            jumps++;
            e = longest;
        }
       }
       return jumps;
    }

}