class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        int totalWords = words.length;
        int wordLength = words[0].length();

        Map<String, Integer> wordsMap = new HashMap<>(); // <word, count>
        Arrays.stream(words).forEach(word -> wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1));
        
        for (int i = 0; i < wordLength; i++) {
            Map<String, Integer> currMap = new HashMap<>();
            for (int j = i; j <= s.length() - wordLength; j += wordLength) {
                String curr = s.substring(j, j + wordLength);
                if (j - i >= totalWords * wordLength) {
                    int idx = j - totalWords * wordLength;
                    String prev = s.substring(idx, idx + wordLength);
                    currMap.put(prev, currMap.getOrDefault(prev, 1) - 1);
                    if (currMap.get(prev) == 0) currMap.remove(prev);
                }
                currMap.put(curr, currMap.getOrDefault(curr, 0) + 1);
                if (currMap.equals(wordsMap)) {
                    System.out.println(j);
                    result.add(j - (totalWords - 1) * wordLength);
                }
            }
        }
        return result;
    }
}