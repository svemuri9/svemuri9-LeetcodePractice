class Solution {
    public int scoreOfString(String s) {
        
        int ans = 0;

        int s1 = 0;
        int s2 = 1;

        while ( s2 != s.length() ) {
            int ch1 = s.charAt(s1) - 'a';
            int ch2 = s.charAt(s2) - 'a';
            ans += Math.abs(ch1 - ch2);
            s1++;
            s2++;
        }

        return ans;
    }
}