// subarrays with sum k
// approach:- we will use a hashmap and will store the prefix sum of array elements
// if sum==k then we will increase the count , or else we will add the sum to the hashmap





class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int sum=0;
        int count=0;

        for(int i=0 ;i<nums.length ; i++){
            sum+=nums[i];

            if(sum==k){
                count++;
            }
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
                map.put(sum, map.getOrDefault(sum,0) +1 );
            }
            else{
                map.put(sum, map.getOrDefault(sum,0) +1 );
            }
        }

        return count;
    }
}