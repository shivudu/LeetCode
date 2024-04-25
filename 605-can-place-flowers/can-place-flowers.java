class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        for(int i=0;i<fb.length;i++){
           int t = fb[i];
           if(t == 0 && (i+1 == fb.length || fb[i+1]== 0) && (i==0 || fb[i-1] == 0)){
                fb[i] = 1;
                n--;
           }
        }
        return n <= 0;
    }
}