class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j =0, n=0, ind1=0, ind2=0;
        int f=0, s=0;
        int m = nums1.length + nums2.length;
        if(m % 2 == 0){
            ind1 = m/2-1;
            ind2 = m/2;
        }
        else{
            ind1 = m/2;
        }
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
               int tmp = nums1[i++];
                if(n == ind1)
                    f = tmp;
                if(n == ind2)
                    s = tmp;
                n++;
            }
            else{
                int tmp = nums2[j++];
                if(n == ind1)
                    f = tmp;
                if(n == ind2)
                    s = tmp;
                n++;
            }
        }
        if(i == nums1.length)
                while(j < nums2.length){
                    int tmp = nums2[j++];
                if(n == ind1)
                    f = tmp;
                if(n == ind2)
                    s = tmp;
                n++;
                }
            if(j == nums2.length)
                while(i < nums1.length){
                    int tmp = nums1[i++];
                if(n == ind1)
                    f = tmp;
                if(n == ind2)
                    s = tmp;
                n++;
                }

        
        if(m %2 != 0){
            return f;
        }
        else
            return ((double)f+s)/2;
    }
}