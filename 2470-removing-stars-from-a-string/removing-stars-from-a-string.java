class Solution {
    public String removeStars(String s) {
       int idx = 0;
        int len = s.length();        
        byte[] bytes = new byte[len];
        s.getBytes(0, len, bytes, 0);
        for (byte ch : bytes) {
            if (ch == '*') {
                idx--;
            } else {
                bytes[idx++] = ch;
            }
        }

        return new String(bytes, 0, idx);
    }
}