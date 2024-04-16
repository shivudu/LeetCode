class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->a[0]-b[0]);
        Set<Pair<Integer,Integer>> set = new HashSet<>();
        int m = nums1.length;
        int n = nums2.length;
        List<List<Integer>> res = new ArrayList<>();
        q.add(new int[]{nums1[0]+nums2[0],0,0});
        set.add(new Pair(0,0));
        while(k-->0 && !q.isEmpty()){
           int[] arr = q.poll();
           int i = arr[1];
           int j = arr[2];
           Pair p1= new Pair(i+1,j);
           Pair p2 = new Pair(i, j+1);
           res.add(List.of(nums1[i],nums2[j]));
           if(i+1 < m && !set.contains(p1)){
             q.add(new int[]{nums1[i+1]+nums2[j],i+1,j});
             set.add(p1);
           }
           if(j+1 < n && !set.contains(p2)){
             q.add(new int[]{nums1[i]+nums2[j+1],i,j+1});
             set.add(p2);
           }
        }
        return res;
    }
}