class Solution {
    public String removeStars(String s) {
        //Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == '*'){
                res.deleteCharAt(res.length()-1);
            } else{
                res.append(s.charAt(i));
            }
            i++;
        }
        return res.toString(); 
    }
}