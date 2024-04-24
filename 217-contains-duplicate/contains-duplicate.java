class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        boolean dup = false;
        for(int n:nums){
            if(s.contains(n)){
                dup = true;
                break;
            }
            s.add(n);
        }
        return dup;
    }
}