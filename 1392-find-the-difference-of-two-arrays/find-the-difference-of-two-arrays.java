class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        for(int n:nums1)
            set1.add(n);
        for(int n:nums2)
            set2.add(n);
        List<Integer> list1 = new ArrayList<>();
        for(int n:set1)
            if(!set2.contains(n))
                list1.add(n);
        res.add(list1);
        List<Integer> list2 = new ArrayList<>();
        for(int n:set2)
            if(!set1.contains(n))
                list2.add(n);
        
        res.add(list2);
        return res;
    }
}