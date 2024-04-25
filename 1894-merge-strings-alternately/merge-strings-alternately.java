class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        StringBuilder res = new StringBuilder();
        while(i < word1.length() && j< word2.length()){
            res.append(word1.charAt(i++));
            res.append(word2.charAt(j++));
        }
        if(i < word1.length())
            res.append(word1.substring(i,word1.length()));
        else if(j < word2.length())
            res.append(word2.substring(j,word2.length()));
        return res.toString();
    }
}