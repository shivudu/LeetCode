class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)-> b[1]-a[1]);
        for(int i=1;i<nums.length;i++){
            int j = i;
            while(j-1>=0 && nums[j-1] > nums[j]){
                int t = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = t;
                j--;
            }
        }
        int t = nums[0],count = 0;
       for(int i=0;i<nums.length;i++){
            if(t == nums[i]){
                count++;
                if(nums.length-1 == i)
                    q.add(new int[]{t,count});
            } else{
                q.add(new int[]{t,count});
                if(nums.length-1 == i)
                    q.add(new int[]{nums[i],1});
                t = nums[i];
                count = 1;
            }
       }
       int[] res = new int[k];
       int i = 0;
       while(!q.isEmpty() && i<k)
        res[i++] = q.poll()[0];
       return res;
    }
}