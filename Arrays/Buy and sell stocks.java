// problem :- buy and sells stocks best time 
// approach :- we will just assume arr[0] to be the minimum and will try to iterate through the array to find the next minimum ...if we found the minimum then we will update it and if arr[i] > minimum we will find the differnece and will store it ....AT LAST WE WILL RETURN THE MAX DIFFERNECE (max profit) 

// TC:- O(N) , SC:-O(1)





class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int diff =0;
        int maxdiff = 0;
        for(int i =1 ; i<prices.length ; i++){

            if(prices[i] < min){
                min = prices[i];
            }

            else if(prices[i] > min){
             diff = prices[i] -min;
             maxdiff = Math.max(diff, maxdiff);
            }
        }

        return maxdiff;
    }
}