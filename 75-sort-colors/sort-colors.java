class Solution {
    static class Heap{
        int[] heap;
        int i;
        public Heap(int[] s){
            heap = s;
            i = 0;
        }
        public void add(int n){
            heap[i++] = n;
            heapify();
        }
        public int poll(){
            int res = heap[0];
            heap[0] = heap[--i];
            int p = 0;
            int lc = (2 * p) + 1;
            int rc = (2 * p) + 2;
            while((lc < i && heap[p] < heap[lc]) || (rc < i && heap[p] < heap[rc])){
                if(heap[lc] > heap[rc]){
                    int t = heap[lc];
                    heap[lc] = heap[p];
                    heap[p] = t;
                    p = lc;
                } else{
                    int t = heap[rc];
                    heap[rc] = heap[p];
                    heap[p] = t;
                    p = rc;
                }
                lc = (2 * p) + 1;
                rc = (2 * p) + 2;
            }
            return res;
        }
        public void heapify(){
            if(i<2)
                return;
            int c = i-1;
            int p = (c - 1)/2;
            while(heap[c]>heap[p]){
                int t = heap[c];
                heap[c] = heap[p];
                heap[p] = t;
                c = p;
                p = (c-1)/2;
            }
        }
    }
    public void sortColors(int[] nums) {
       Heap h = new Heap(nums);
       for(int n: nums)
            h.add(n);
        for(int i= nums.length-1;i>=0;i--)
            nums[i] = h.poll(); 
    }
}