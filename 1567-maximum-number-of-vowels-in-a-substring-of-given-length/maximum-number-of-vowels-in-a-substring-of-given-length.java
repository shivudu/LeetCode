class Solution {
    public int maxVowels(String s, int k) {
        
        int oS = 0;
        for(int i=0;i<k;i++)
            if(contains(s.charAt(i)))
                oS++;
        int max = oS;
        for(int i = k;i<s.length();i++){
            if(!contains(s.charAt(i-k)) && contains(s.charAt(i)))
                oS++;
            else if(contains(s.charAt(i-k)) && !contains(s.charAt(i)))
                oS--;
            max = Math.max(oS,max);
        }
        return max;
    }
    private boolean contains(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}