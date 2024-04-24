class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int n: nums)
            map.put(n,map.getOrDefault(n,0)+1);
        List<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e: map.entrySet())
            if(e.getValue() > nums.length / 3)
                res.add(e.getKey());
        return res;
    }
}