class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        int index = 0;
        Deque<Integer> dq = new ArrayDeque<Integer>();
        for(int i=0;i<nums.length;i++){
           while(!dq.isEmpty() && dq.peekFirst() <= i-k)
                dq.pollFirst();
            while(!dq.isEmpty()){
                if(nums[dq.peekLast()] < nums[i])
                    dq.pollLast();
                else
                    break;
            }
            dq.offerLast(i);
            if(i+1 >= k)
                res[index++] = nums[dq.peekFirst()];
        }
        return res;
    }
}