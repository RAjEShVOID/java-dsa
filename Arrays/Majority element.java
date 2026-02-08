class Solution {
    public int majorityElement(int[] nums) {
        int current = nums[0];
        int count =0;

        for(int i=0 ; i<nums.length ; i++){
            if(count == 0){
                count =1;
                current = nums[i];
            }
            else if( nums[i] == current){
                count++;
            }
            else {
                count --;
            }
        }

        int count1 = 0;
        for(int i= 0 ; i< nums.length ; i++){
            if( nums[i] == current){
                count1++;
            }
        }

        if(count1 > (nums.length)/2 ){
            return current;
        }

        return -1;
    }
}