problem :- max consecutive ones
platform leetcode
approach - run a loop and count 1's , if 0 comes make count 0 and keep an update of maxcount.

time- O(N)
space - O(1)





class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int maxcount=0;
        for(int i = 0 ; i<nums.length ; i++){

            if(nums[i]==1){
               count++;
            }
            else{
                maxcount = Math.max(count , maxcount);
                count =0;
            }
        }

        return Math.max(count , maxcount);
    }
}