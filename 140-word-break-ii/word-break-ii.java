

class Solution {
    List<String> arr=new ArrayList<>();
  public List<String> wordBreak(String s, List<String> wordDict){     
         backtrack(0,wordDict,s,"");
          return arr;
     }
     public void backtrack(int ptr, List<String> wordDict,String s,String curr)
     {
        if(ptr==s.length()){
            arr.add(curr);
            return;
        }
        
         for(String str: wordDict)
         {
            int length = str.length();
            if(s.length()>=length+ptr)
            {
            String sub = s.substring(ptr, ptr+length);
            if(sub.equals(str))
            {
                if(curr.length()==0)backtrack(length+ptr,wordDict,s,str);
                else backtrack(length+ptr,wordDict,s,curr+" "+str);
            }
            }
         }
     } 

}     