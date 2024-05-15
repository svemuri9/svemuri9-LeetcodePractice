class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       List<Integer>ans=new ArrayList<>() ;
       int n=nums.length;
       HashSet<Integer> set=new HashSet<>();
       for(Integer val : nums){
           set.add(val);
       }
       for(int i=1;i<=n;i++){
       if(!set.contains(i)){
           ans.add(i);
       }
       }
       return ans;
    }
}