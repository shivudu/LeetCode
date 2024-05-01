class KthLargest {
    PriorityQueue<Integer> heapK;
    PriorityQueue<Integer> heap;
    int k;
    public KthLargest(int k, int[] nums) {
        heap = new PriorityQueue<>((a,b)->b-a);
        heapK = new PriorityQueue<>();
        if(nums.length < k){
           for(int n: nums)
            heapK.add(n); 
        } else {
        for(int n: nums)
            heap.add(n);
        int i = k;
        while(i-- > 0 && nums.length >=k)
            heapK.add(heap.poll());
        }
        this.k = k;
    }
    
    public int add(int val) {
        int res;
        if(heapK.size() < k){
            heapK.add(val);
            return heapK.peek();
        }
        if(val < heapK.peek()){
            res = heapK.peek();
            heap.add(val);
        } else{
            heapK.add(val);
            heap.add(heapK.poll());
            res = heapK.peek();
        }
        return res;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */