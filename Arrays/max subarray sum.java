// Problem :- max subarray sum , solution is kadanes algorithm
// add the array elements one by one and if sum becomes negatuve make sum=0 ..... store the maxsum and at the end return max sum

// TC- O(N) , SC- O(1)






class Solution {
    public int maxSubArray(int[] nums) {

        int sum = 0;
        int maxsum =Integer.MIN_VALUE;

        for(int i =0 ; i< nums.length ; i++){

            sum+=nums[i];
            
            if(sum>maxsum){
                maxsum = sum;
            }

            if(sum<0){
                sum=0;
            }
        }

        return maxsum;
    }
}