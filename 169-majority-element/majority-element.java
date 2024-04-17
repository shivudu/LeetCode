class Solution {
    public int majorityElement(int[] nums) {
       Map<Integer,Integer> c = new HashMap<>();
       int max = nums.length/2;
       int res =0;
       for(int n: nums){
        int t = c.getOrDefault(n,0)+1;
        if(t > max){
            res = n;
            break;
        }
        c.put(n, t);
       }
       return res;
    }
}