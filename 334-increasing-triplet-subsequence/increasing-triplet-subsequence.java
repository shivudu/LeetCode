class Solution {
    public boolean increasingTriplet(int[] nums) {
        boolean found = false;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for(int n:nums){
            if(n <= min1){
                min1 = n;
            } else if(n <= min2){
                //min1 = min2;
                min2 = n;
            } else{
                found = true;
                break;
            }
           
        }
        return found;
    }
}