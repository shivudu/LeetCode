class Solution {
    public String largestNumber(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
           String ab =a+""+b;
           String ba =b+""+a;
           return ba.compareTo(ab);
        });
        for(int n:nums)
            pq.add(n);
        StringBuilder res = new StringBuilder();
        int i = 0;
        while(!pq.isEmpty()){
            int v = pq.poll();
            if(i++==0 && v==0)
                return "0";
            res.append(v);
            }
        return res.toString();
    }
}