class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length , sum = 0 , total_cust = 0 , max = 0;
        int start = 0 , end = minutes-1;
        
        for(int i = 0; i < minutes; i++) {
            if(grumpy[i] == 1) 
                sum += customers[i];
            max = Math.max(max , sum);
        }
        
        for(int i = minutes , j = 0 ; i < n ; i++ , j++) {
            if(grumpy[j] == 1) 
                sum -= customers[j] ;
            if(grumpy[i] == 1) 
                sum += customers[i] ;
            if(max < sum) {
                max = sum ;
                start = j+1;
                end = i;
            }
        }
        
         for(int i = 0; i < n; i++)  {
             if((i >= start && i <= end) || grumpy[i] == 0) 
                 total_cust += customers[i];
         }
        
        return total_cust;
    } 
}