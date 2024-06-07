class Solution {
    public boolean isAnagram(String s, String t) {
        int seen1[] = new int[26];
        int seen2[] = new int[26];
        for(char c : s.toCharArray())
            seen1[c-'a']++;
        for(char c : t.toCharArray())
            seen2[c-'a']++;
        return Arrays.equals(seen1, seen2);
    }
}