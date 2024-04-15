class Solution {
    /** 
    static class Heap{
        public List<Integer> heap = new ArrayList<>();
        public void add(int v){
           heap.add(v);
           int i = heap.size()-1;
           int j = (i-1)/2;
           while(j>=0 && heap.get(i)>heap.get(j)){
             int tmp = heap.get(i);
             heap.set(i,heap.get(j));
             heap.set(j, tmp);
             i = j;
             j = (i-1)/2;
           } 
        }
        public int remove(){
            if(heap.size() == 0){
                return -1;
            }
            if(heap.size() == 1){
                return heap.remove(0);
            }
            int l = heap.size()-1;
            int res = heap.get(0);
            int j = 0;
            heap.set(j, heap.get(l));
            heap.remove(l);
            l--;
            int lc = j * 2 +1;
            int rc = j * 2 +2;    
            while(l >=0 && (lc<heap.size() && heap.get(lc) > heap.get(j)) || (rc<heap.size() && heap.get(rc) > heap.get(j))){
                if(rc >= heap.size()){
                    int tmp = heap.get(lc);
                    heap.set(lc, heap.get(j));
                    heap.set(j, tmp);
                    j = lc;
                }
                else if(heap.get(lc) > heap.get(rc)){
                    int tmp = heap.get(lc);
                    heap.set(lc, heap.get(j));
                    heap.set(j, tmp);
                    j = lc;
                }else{
                    int tmp = heap.get(rc);
                    heap.set(rc, heap.get(j));
                    heap.set(j, tmp); 
                    j = rc;                   
                }
                lc = j*2 +1;
                rc = j*2 +2;
            }

            return res;
        }
    }
    */
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int n: nums)
            heap.add(n);
        int res = 0;
        for(int i=1;i<=k;i++){
            res = heap.poll();
        }
        return res;
    }
}