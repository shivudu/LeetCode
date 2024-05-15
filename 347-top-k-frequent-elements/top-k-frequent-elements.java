class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       int[] res = new int[k];
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int n:nums)
            map.put(n, map.getOrDefault(n,0)+1);
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)->b.getValue()-a.getValue());
        for(int i=0;i<res.length;i++)
            res[i] = list.get(i).getKey();
        return res;
    }
}