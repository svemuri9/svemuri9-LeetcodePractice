class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0;
        int r = 0;
        int maxFruits = 0;
        Map<Integer,Integer> map = new HashMap<>();
        while(r < fruits.length)
        {
            map.put(fruits[r] , map.getOrDefault(fruits[r] , 0) + 1);
            if(map.keySet().size() > 2)
            {
                if(map.get(fruits[l]) == 1)
                    map.remove(fruits[l]);
                else
                    map.put(fruits[l] , map.getOrDefault(fruits[l] , 0) - 1);
                l++;
            }
            maxFruits = Math.max(maxFruits , r - l + 1);
            r++;
        }
        return maxFruits;
    }
}