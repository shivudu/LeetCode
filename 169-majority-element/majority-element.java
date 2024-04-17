class Solution {
    public int majorityElement(int[] nums) {
      int c = 0;
      int res = 0;
      for(int n: nums){
        if(c == 0)
            res = n;
        if(n == res)
            c++;
        else
            c--;
      }
      return res;
    }
}