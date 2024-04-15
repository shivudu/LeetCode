class Solution {
    static class PC implements Comparable<PC>{
        public Integer prof;
        public Integer cap;
        public PC(int prof, int cap){
            this.prof=prof;
            this.cap = cap;
        }
        public String toString(){
            return "["+prof+":"+cap+"]";
        }
        @Override
        public int compareTo(PC o){
            return this.prof.compareTo(o.prof);
        }

    }
    static class Heap{
        public List<PC> h = new ArrayList<>();
        public void add(PC pc){
            h.add(pc);
            int i = h.size()-1;
            int p = (i-1)/2;
            while(p>=0 && h.get(i).prof > h.get(p).prof){
                PC t = h.get(i);
                h.set(i,h.get(p));
                h.set(p,t);
                i = p;
                p = (i - 1)/2;
            }
        }
        public PC remove(){
            if(h.size() == 1)
                return h.remove(0);
            int c = h.size()-1;
            int p = 0;
            PC res = h.get(p);
            h.set(p, h.get(c));
            h.remove(c);
            c--;
            int lc = p *2 +1;
            int rc = p* 2 +2;
            while((lc < h.size() && h.get(lc).prof > h.get(p).prof) || (rc < h.size() && h.get(rc).prof > h.get(p).prof)){
                if(rc >= h.size()){
                    PC tmp = h.get(lc);
                    h.set(lc,h.get(p));
                    h.set(p,tmp);
                    p = lc;
                }
                else if(h.get(lc).prof > h.get(rc).prof){
                    PC tmp = h.get(lc);
                    h.set(lc,h.get(p));
                    h.set(p,tmp);
                    p = lc;
                }
                else{
                    PC tmp = h.get(rc);
                    h.set(rc,h.get(p));
                    h.set(p,tmp);
                    p = rc;
                }
                lc = p*2+1;
                rc = p*2+2;
            } 
            return res;
        }
        public int size(){
            return h.size();
        } 
    }
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
       PriorityQueue<PC> h = new PriorityQueue<>(Collections.reverseOrder());
       PriorityQueue<PC> hc = new PriorityQueue<>((a,b) -> a.cap - b.cap);
        for(int i=0;i<profits.length;i++){
            hc.add(new PC(profits[i],capital[i]));
        }
        
        //System.out.println(h.h);
        int n = 1;
        while(n++<=k){
            while(!hc.isEmpty() && hc.peek().cap <= w){
                h.add(hc.poll());
            }
            if(h.isEmpty())
                break;
            w = w + h.poll().prof;
        }
        return w;
    }
}