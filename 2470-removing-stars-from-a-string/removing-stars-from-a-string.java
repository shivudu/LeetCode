class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == '*'){
                st.pop();
            } else{
                st.push(s.charAt(i));
            }
            i++;
        }
        for(char c:st)
           res.append(c);
        return res.toString(); 
    }
}