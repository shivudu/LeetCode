class Solution {
    public String reverseVowels(String s) {
        int st = 0, e = s.length()-1;
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        char[] arr = s.toCharArray();
        while(st<e){
            boolean strt= set.contains(Character.toLowerCase(s.charAt(st)));
            boolean end= set.contains(Character.toLowerCase(s.charAt(e)));
            if(!strt)
                st++;
            if(!end)
                e--;
            if(strt && end){
                char t = arr[st];
                arr[st] = arr[e];
                arr[e] = t;
                st++;
                e--;
            }
        }
        return new String(arr);
    }
}