//problem:- String Compression
//we will keep a pointer to first index and one more pointer to iterate
//we will run a loop through the given array and will keep the count of element appearing , when new element comes we will make the index as element and index++ then next the count
// TC:- O(N) , SC:- O(1)

class Solution {
    public int compress(char[] chars) {
        int i=0;
         int index = 0;  

        while(i<chars.length){
           
            char curr_char = chars[i];
            int count =0;


            while( i<chars.length &&  chars[i] == curr_char){
                count++;
                i++;
            }  
            chars[index++] = curr_char;
            if(count>1){
                for (final char c : String.valueOf(count).toCharArray()) {
            chars[index++] = c;
            }

            }
                    
        }

        return index;
    }
}