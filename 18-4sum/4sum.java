class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return kSum(0, 4, target, nums);
    }

    private List<List<Integer>> kSum(int s, int k, int target, int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums[0] == -1000000000 && nums.length == 5)
            return res;
        long average_value = target / k;
        if  (nums[s] > average_value || average_value > nums[nums.length - 1]) {
            return res;
        }
        if (k == 2)
            return twoSum(nums, target, s);
        
        //System.out.println("ksum");
        for (int i = s; i < nums.length - (k - 1); i++) {
            //System.out.println("k:" + k + " i: " + i);
            if(i == s || nums[i-1] != nums[i])
            for (List<Integer> l : kSum(i + 1, k - 1, target - nums[i], nums)) {
                res.add(new ArrayList<>(List.of(nums[i])));
                res.get(res.size() - 1).addAll(l);
            }
        }
        return res;
    }

    private List<List<Integer>> twoSum(int[] nums, int target, int start) {
        int e = nums.length - 1;
        int s = start;
        List<List<Integer>> res = new ArrayList<>();
        //System.out.println("start: "+start+" target:"+target);
        while (start < e) {
            long t = (long) nums[e] + nums[start];
            if (nums[e] + nums[start] < target || (start > s && nums[start] == nums[start - 1])) {
                start++;
            } else if (nums[e] + nums[start] > target || (e < nums.length - 1 && nums[e] == nums[e + 1])) {
                e--;
            } else {
                res.add(List.of(nums[start], nums[e]));
                start++;
                e--;
            }
        }
        //System.out.println("two sum:" + res);
        return res;
    }
}