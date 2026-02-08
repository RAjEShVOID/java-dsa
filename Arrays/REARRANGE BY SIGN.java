// problem :- rearrange array elements by sign
// make an array and  iterate through the given array to store positives at 0 and negatives at 1 ...and then do +2 for next positive and negative
// return the array you made

//TC :- O(N) , SC:- O(N)


class Solution {
    public int[] rearrangeArray(int[] nums) {
        int []ans = new int[nums.length];
        int pos =0 , neg =1;

        for(int i=0 ; i<nums.length ; i++){

            if(nums[i]<0){
                ans[neg] = nums[i];
                neg+=2;
            }
            else if( nums [i] >0){
                ans[pos] = nums[i];
                pos+=2;
            }
        }

        return ans;
    }
}