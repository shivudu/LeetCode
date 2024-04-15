class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j =0, n=0;
        int[] nums = new int[nums1.length + nums2.length];
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                nums[n++] = nums1[i++];
            }
            else{
                nums[n++] = nums2[j++];
            }
        }
        if(i!= nums1.length){
            while(i < nums1.length){
                nums[n++] = nums1[i++];
            }
        }
        if(j!= nums2.length){
            while(j < nums2.length){
                nums[n++] = nums2[j++];
            }
        }
        if(nums.length %2 != 0){
            return nums[nums.length/2];
        }
        else
            return ((double)nums[nums.length/2 -1] + nums[nums.length/2])/2;
    }
}