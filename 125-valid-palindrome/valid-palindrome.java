class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length()-1;
        boolean res = true;
        while(i<=j){
            System.out.println(s.charAt(i)+" "+s.charAt(j));
            if(!Character.isAlphabetic(s.charAt(i)) && !Character.isDigit(s.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isAlphabetic(s.charAt(j)) && !Character.isDigit(s.charAt(j))){
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