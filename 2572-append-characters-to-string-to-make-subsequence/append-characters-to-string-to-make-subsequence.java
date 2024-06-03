class Solution {
    public int appendCharacters(String s, String t) {
        //         usint two pointer on two of the strings and if characters matches increase both and if not then just increase pointer of s string 
        int i=0,j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else i++;
        }
        return t.length()-j;
    }
}