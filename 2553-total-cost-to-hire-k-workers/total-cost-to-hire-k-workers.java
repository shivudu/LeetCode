class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<int[]> h = new PriorityQueue<>((a,b)->{return a[0]==b[0] ? a[1]-b[1] : a[0]-b[0];});
        
        int sI=-1,eI=-1;
        if(costs.length > candidates * 2){
            int e = costs.length - candidates * 2;
            sI = candidates;
            eI = costs.length - candidates-1;
        }
        System.out.println(sI+" @ "+eI+" @"+costs.length);
        for(int i=0;i<costs.length;i++)
            if(!(i>=sI && i<=eI))
                h.add(new int[]{costs[i],i});
        System.out.println(sI+" @ "+eI+" @"+costs.length+"size"+h.size());
            long res = 0;        
        while(k-->0){
            int[] t = h.poll();
            res += t[0];
            if(sI!=-1 && sI <= eI){
                if(t[1]<costs.length/2)
                    h.add(new int[]{costs[sI++],0});
                else
                    h.add(new int[]{costs[eI--],costs.length-1});
            }
        }
        return res;
    }
}