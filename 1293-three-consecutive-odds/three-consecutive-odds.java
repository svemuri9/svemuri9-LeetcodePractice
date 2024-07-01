class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count =0;
        if (arr.length<3)return false;
        for (int i =0; i<arr.length;i++)
        {
            if (arr[i]%2==1) count++;
            if (count >=3) return true;
            if (arr[i]%2==0) count=0;
        }
        return false;
    }
}