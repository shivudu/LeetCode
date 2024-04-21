class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        boolean res = true;
        while(i<=j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                res = false;
                break;
            }
            i++;
            j--;
        }
        return res;
    }
}