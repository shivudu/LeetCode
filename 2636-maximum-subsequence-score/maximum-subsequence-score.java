class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        // Max heap for nums2 min values
        PriorityQueue<int[]> maxH = new PriorityQueue<>((a,b)->b[1]-a[1]);
        // Min heap for nums2 sum values
        PriorityQueue<Integer> minH = new PriorityQueue<>();
        //load Max heap
        for(int i=0;i<n;i++)
            maxH.add(new int[]{nums1[i],nums2[i]});

        long res = 0;
        long total = 0;
        int[] t;
        while(!maxH.isEmpty()){
            t = maxH.poll();
            total += t[0];
            minH.add(t[0]);
            if(minH.size() > k)
                total -= minH.poll();
            if(minH.size() == k)
                res = Math.max(res, t[1] * total);
        }
        return res;
         
    }

}