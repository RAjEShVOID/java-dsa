//TC:- O(N) , SC:- O(M) where M are the no. of leaders in the array

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int max = arr[arr.length-1];
        list.add(max);
        
        for(int i=arr.length-2 ; i>=0 ; i--){
            
            if(max <= arr[i] ){
                list.add(arr[i]);
                max = arr[i];
            }
            
        }
    
       Collections.reverse(list);
       return list;
    }
}
