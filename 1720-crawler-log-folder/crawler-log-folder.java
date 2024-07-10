class Solution {
    public int minOperations(String[] logs) {
        int count =0;
        for (var log: logs) {
      switch (log) {
        case "../":
          count = Math.max(0, count - 1);
          break;
        case "./":
          break;
        default:
          count++;
      }
    }
        return count;
    }
}