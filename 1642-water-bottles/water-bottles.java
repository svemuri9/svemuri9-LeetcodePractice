class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count =numBottles;
        while (numBottles>=numExchange)
        {
           int q=  numBottles/numExchange;
           count+=q;
           q=0;
           numBottles=numBottles/numExchange+numBottles%numExchange;
        }

       return count; 
    }
}