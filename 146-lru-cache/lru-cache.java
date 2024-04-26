class LRUCache {
    Map<Integer,Integer> cache;
    int capacity;
    public LRUCache(int capacity) {
        this.cache = new LinkedHashMap<>();
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            int v = cache.get(key);
            cache.remove(key);
            cache.put(key,v);
            return v;
        } else{
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            cache.remove(key);
        } else if(cache.size()+1 > capacity){
            int k = cache.entrySet().iterator().next().getKey();
            cache.remove(k);
        }
        cache.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */