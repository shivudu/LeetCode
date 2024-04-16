class Solution {
    public String[] findRelativeRanks(int[] score) {
        //PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->b[0]-a[0]);
        TreeSet<int[]> s = new TreeSet<>((a,b)->b[0]-a[0]);
        for(int i=0;i<score.length;i++)
            s.add(new int[]{score[i],i});
        String[] res = new String[score.length];
        int i = 1;
        for(int[] t: s){
            if(i==1)
             res[t[1]] = "Gold Medal";
            else if(i==2)
              res[t[1]] ="Silver Medal";
            else if(i==3)
              res[t[1]] = "Bronze Medal";
            else
                res[t[1]] =""+i; 
            i++;
        }
        return res;


    }
}