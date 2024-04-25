class Solution {
    public int compress(char[] chars) {
        if (chars.length <= 1)
            return chars.length;

        int len = 0; // Pointer to write compressed characters
        int i = 0; // Pointer to iterate through the original array

        while (i < chars.length) {
            char cr = chars[i]; // Current character
            int count = 1; // Count of consecutive occurrences of cr

            // Count consecutive occurrences of cr
            while (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                count++;
                i++;
            }

            // Write compressed character to chars array
            chars[len++] = cr;

            // Handle count > 1
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char digit : countStr.toCharArray()) {
                    chars[len++] = digit;
                }
            }

            i++; // Move to the next character in the original array
        }

        return len; // Return the new length of the compressed array
    }
}