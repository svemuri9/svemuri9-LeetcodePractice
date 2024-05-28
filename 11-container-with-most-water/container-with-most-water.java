class Solution {
    public int maxArea(int[] height) {
        int i = 0 ; 
        int j = height.length - 1;
        int fres = Integer.MIN_VALUE;
        while(i < j){
            int a = Math.min(height[i],height[j]);
            //area of rectangle formula : l * b
            fres = Math.max(fres,a*(j-i));
            if(height[i] < height[j])
                i++;
            else
                j--;
        }
        return fres;
    }
}