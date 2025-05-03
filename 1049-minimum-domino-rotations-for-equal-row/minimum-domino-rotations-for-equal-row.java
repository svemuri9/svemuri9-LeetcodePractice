class Solution {
    private int getRotation(int[] tops, int[] bottoms, int target) {
        int rotations = 0;
        for (int i = 0; i < tops.length; i++) {
            if (tops[i] == target) continue;
            if (bottoms[i] == target) rotations++;
            else return Integer.MAX_VALUE;
        }
        return rotations;
    }
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int poss1 = getRotation(tops, bottoms, tops[0]);
        int poss2 = getRotation(bottoms, tops, bottoms[0]);
        int poss3 = getRotation(tops, bottoms, bottoms[0]);
        int poss4 = getRotation(bottoms, tops, tops[0]);
        
        int ans   = Math.min(poss1, Math.min(poss2, Math.min(poss3, poss4)));

        return ans == Integer.MAX_VALUE?-1:ans;
        
    }
}