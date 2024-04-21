class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        StringBuilder res = new StringBuilder();
        int r=0,t=1;
        List<Character>[] arr = new ArrayList[numRows];
        for(int i=0;i<arr.length;i++)
            arr[i] = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            arr[r].add(s.charAt(i));
            if(r == 0){
                t = 1;
            } else if(r == arr.length-1){
                t = -1;
            }
            r += t;
        }
        for(List<Character> row: arr){
            for(char c:row){
                res.append(c);
            }
        }
        return res.toString();
    }
}