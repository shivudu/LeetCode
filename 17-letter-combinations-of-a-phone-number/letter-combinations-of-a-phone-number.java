class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty())
            return Collections.emptyList();
        String[] data = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> res = new ArrayList<>();
        recurs("",digits,data,res);
        return res;
    }
    private void recurs(String comb,String digits,String[] data,List<String> res){
        if(digits == null || digits.isEmpty()){
            res.add(comb);
        } else{
        char c = digits.charAt(0);
        int indx = (c - '0') - 2;
        String nums = data[indx];
        for(int i=0;i<nums.length();i++){
            recurs(comb + nums.charAt(i), digits.substring(1), data, res);
        }
        }
    }
}