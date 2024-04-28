class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.isEmpty() || words == null || words.length == 0) {
            return result;
        }

        int wordLength = words[0].length();
        int totalLength = wordLength * words.length;
        int n = s.length();
        
        // Create a map to store the frequency of words in the words array
        Map<String, Integer> wordFreq = new HashMap<>();
        for (String word : words) {
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i <= n - totalLength; i++) {
            Map<String, Integer> seen = new HashMap<>();
            int wordsFound = 0;

            // Process the substring in the sliding window
            for (int j = i; j < i + totalLength; j += wordLength) {
                String currWord = s.substring(j, j + wordLength);
                if (!wordFreq.containsKey(currWord)) {
                    break;  // Not a valid word
                }
                seen.put(currWord, seen.getOrDefault(currWord, 0) + 1);
                if (seen.get(currWord) > wordFreq.get(currWord)) {
                    break;  // Word frequency exceeded
                }
                wordsFound++;
            }

            // Check if all words are found in the substring
            if (wordsFound == words.length) {
                result.add(i);
            }
        }

        return result;
    }
}