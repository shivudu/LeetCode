class SmallestInfiniteSet {

    PriorityQueue<Integer> backed;
    Set<Integer> set;
    int cS;

    public SmallestInfiniteSet() {
        backed = new PriorityQueue<>();
        set = new HashSet<>();
        cS = 1;
    }
    
    public int popSmallest() {
        if(backed.size() == 0)
            return cS++;
        else{
            int t = backed.poll();
            set.remove(t);
            return t;
        }
    }
    
    public void addBack(int num) {
        if(num >= cS)
            return;
        else{
            if(cS - backed.size() == 1)
                return;
            if(cS-num == 1 && !set.contains(num)){
                cS--;
                return;
            }
            if(!set.contains(num)){
                backed.add(num);
                set.add(num);
                }
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */