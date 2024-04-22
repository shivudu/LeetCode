class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            int s = i+1; int e = nums.length-1;
            int n = nums[i];
            while(s<e){
                int t = nums[s] + nums[e] + n;
                if(t == 0){
                    if(set.add(List.of(n,nums[s],nums[e]))){
                        res.add(List.of(n,nums[s],nums[e]));
                    }
                    s++;e--;
                } else if(t > 0){
                    e--;
                } else{
                    s++;
                }
            }
        }
        return res;
    }
}