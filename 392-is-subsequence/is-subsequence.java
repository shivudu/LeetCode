class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        int i = 0,m=0;
        int j = t.length()-1,n=s.length()-1;
        while(i<=j && m<=n){
            if(t.charAt(i) == s.charAt(m)){
                count++;
                m++;
            } 
            if(t.charAt(j) == s.charAt(n) && i!=j){
                count++;
                n--;
            }
            i++;
            j--;
            if(count >= s.length())
                break;
        }
        return count >= s.length();
    }
}