/*
PROBLEM - MAX LENGTH SUBARRAY WITH SUM K
TC- O(N)
SC-O(N)
APPROACH- 
Move through the array and keep adding elements to get a running total.
Store sum and index in a hashmap as key and value.

If the sum=k, we got length.

If (sum− k) exists in the hashmap, the elements in between make k.

Use the earliest stored index to get the longest subarray.

CODE-
*/


class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
       HashMap<Integer,Integer> map = new HashMap<>(); 
       int sum=0;
       int maxlength = 0;
       
       for(int i=0 ;i< arr.length ; i++){
           sum+=arr[i];
           
           if(sum==k){
               maxlength = i+1 ;
               
         }
         
         if(map.containsKey(sum-k)){
             maxlength = Math.max(maxlength , i-map.get(sum-k));
         }
         
         map.putIfAbsent(sum,i);
         
       }
       return maxlength;
       
}
}