class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++)
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        StringBuilder minStr = new StringBuilder();
        int tarLen = t.length();
        int cCount = 0;
        int start = 0;
        int minLeft = 0;
        int res = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                if(map.get(c) > 0)
                cCount++;
                map.put(c,map.get(c)-1);
            }
            while(cCount == tarLen){
                int cW = i - start + 1;
                if(cW < res){
                    res = cW;
                    minLeft = start;
                }
                if(map.containsKey(s.charAt(start))){
                    map.put(s.charAt(start),map.get(s.charAt(start)) +1);
                    if(map.get(s.charAt(start)) >0)
                        cCount--;
                }
                start++;
            }
        }
        return res == Integer.MAX_VALUE ? "" : s.substring(minLeft, res + minLeft);
    }
}