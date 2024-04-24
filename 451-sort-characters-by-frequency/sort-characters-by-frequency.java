class Solution {
    public String frequencySort(String s) {
       Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> q = new PriorityQueue<>((a,b)->{
            return b.getValue() - a.getValue();
        });
        for(Map.Entry<Character,Integer> e:map.entrySet())
            q.add(e);
        StringBuilder res = new StringBuilder();
        while(!q.isEmpty()){
            Map.Entry<Character,Integer> t = q.poll();
            for(int i=1;i<=t.getValue();i++)
                res.append(t.getKey());
        }
    return res.toString();

    }
}