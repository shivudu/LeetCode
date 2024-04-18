class RandomizedSet {
    Set<Integer> set;
    ArrayList<Integer> list;
    Random r;
    public RandomizedSet() {
        set = new HashSet<>();
        r = new Random();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        boolean add = set.add(val);
        if(add) list.add(val);
        return add;
    }
    
    public boolean remove(int val) {
        boolean rm = set.remove(val);
        if(rm) list.remove((Integer)val);
        return rm;
    }
    
    public int getRandom() {
        return list.get(r.nextInt(set.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */