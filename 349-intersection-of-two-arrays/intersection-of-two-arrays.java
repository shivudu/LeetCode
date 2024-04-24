class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> set = new HashSet<>();
       for(int n: nums1)
         set.add(n);
       Arrays.sort(nums2);
       List<Integer> res = new ArrayList<>();
       for(int i=0;i<nums2.length;i++){
         if(set.contains(nums2[i])){
            res.add(nums2[i]);
         }
         while(i+1 < nums2.length && nums2[i] == nums2[i+1])
            i++;
       }
       return res.stream().mapToInt(i -> i).toArray();
    }
}