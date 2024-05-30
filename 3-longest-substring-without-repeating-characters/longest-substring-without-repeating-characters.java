class Solution {
    public int lengthOfLongestSubstring(String s) {
        int leftIndex= 0;
        int rightIndex = 0;
        HashSet<Character> charSet = new HashSet<>();
        int ans = 0;

        while(rightIndex < s.length()) {
            if(charSet.contains(s.charAt(rightIndex))) {
                while(charSet.contains(s.charAt(rightIndex))) {
                    charSet.remove(s.charAt(leftIndex));
                    leftIndex++;
                }
            }

            else {
                charSet.add(s.charAt(rightIndex));
                rightIndex++;
            }

            ans = Math.max(rightIndex - leftIndex, ans);
        }

        return ans;
    }
}