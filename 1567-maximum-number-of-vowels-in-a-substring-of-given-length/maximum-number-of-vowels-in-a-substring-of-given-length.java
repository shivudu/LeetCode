class Solution {
    public int maxVowels(String s, int k) {
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int oS = 0;
        for(int i=0;i<k;i++)
            if(set.contains(s.charAt(i)))
                oS++;
        int max = oS;
        for(int i = k;i<s.length();i++){
            if(!set.contains(s.charAt(i-k)) && set.contains(s.charAt(i)))
                oS++;
            else if(set.contains(s.charAt(i-k)) && !set.contains(s.charAt(i)))
                oS--;
            max = Math.max(oS,max);
        }
        return max;
    }
}