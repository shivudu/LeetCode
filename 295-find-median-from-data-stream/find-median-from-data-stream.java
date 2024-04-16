class MedianFinder {
    PriorityQueue<Integer> f;
    PriorityQueue<Integer> s;
    public MedianFinder() {
        f = new PriorityQueue<>(Collections.reverseOrder());
        s = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if(f.peek() == null || f.peek() > num){
            f.add(num);
        }
        else{
            s.add(num);
        }
        balance();
    }
    private void balance(){
        if(Math.abs(f.size()-s.size()) > 1){
            if(f.size() > s.size()){
                int t = f.poll();
                s.add(t);
            }else{
                int t = s.poll();
                f.add(t);
            }
        }
    }
    
    public double findMedian() {
       if((f.size() + s.size()) %2 != 0){
         return f.size() > s.size() ? (double)f.peek() : (double)s.peek();
       }else{
         return f.size() == 0 ? s.peek() : s.size()==0 ? f.peek() : ((double)f.peek() + s.peek())/2;
       }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */