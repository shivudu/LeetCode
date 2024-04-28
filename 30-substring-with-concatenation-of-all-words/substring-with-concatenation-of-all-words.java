class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.isEmpty() || words == null || words.length == 0) {
            return result;
        }

        Map<String, Integer> wordFreq = new HashMap<>();
        for (String word : words) {
            wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
        }

        int wordLength = words[0].length();
        int totalLength = wordLength * words.length;

        for (int i = 0; i <= s.length() - totalLength; i++) {
            Map<String, Integer> seen = new LinkedHashMap<>(wordFreq); // Copy of wordFreq map
            int j = i;
            int wordsFound = 0;

            while (j < i + totalLength) {
                String currWord = s.substring(j, j + wordLength);
                if (!seen.containsKey(currWord) || seen.get(currWord) == 0) {
                    break; // Not a valid word or all occurrences used
                }
                seen.put(currWord, seen.get(currWord) - 1);
                wordsFound++;
                j += wordLength;
            }

            if (wordsFound == words.length) {
                result.add(i);
            }
        }

        return result;
    }
}