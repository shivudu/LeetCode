class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map = new HashMap<>();
        for(String w: words){
            map.put(w,map.getOrDefault(w,0)+1);
        }
        System.out.println(map);
        PriorityQueue<Map.Entry<String,Integer>> q = new PriorityQueue<>((a,b)->{
            if(a.getValue() == b.getValue()){
                return a.getKey().compareTo(b.getKey());
            } else{
                return b.getValue() - a.getValue();
            }
        });
        for(Map.Entry<String,Integer> e:map.entrySet())
            q.add(e);
        List<String> res = new ArrayList<>();
        while(!q.isEmpty() && k-->0)
            res.add(q.poll().getKey());
        return res;
    }
    
}