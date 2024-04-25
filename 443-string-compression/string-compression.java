class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1)
            return 1;
        int len = 0;
        int i = 0;
        while(i<chars.length){
            char cr = chars[i];
            int c = 1;
            while(i+1<chars.length && chars[i] == chars[i+1]){
                c++;
                i++;
            }
            chars[len++] = cr;
            if(c > 1){
                String no = String.valueOf(c);
                chars[len] = cr;
                for(int t=0;t<no.length();t++)
                    chars[len++] = no.charAt(t); 
            }
            i++;
        }
        return len;
    }
}