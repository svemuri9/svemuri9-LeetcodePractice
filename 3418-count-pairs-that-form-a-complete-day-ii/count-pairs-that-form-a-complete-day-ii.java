class Solution {
    public long countCompleteDayPairs(int[] hours) {
        HashMap<Integer, Integer> seenMap = new HashMap<>();
        long count = 0;

        for (int hour : hours) {
            int rem = hour % 24;
            int complement = (24 - rem) % 24;
            if (seenMap.containsKey(complement)) {
                count += seenMap.get(complement);
            }
            seenMap.put(rem, seenMap.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}