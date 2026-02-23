//PROBLEM:- check if sentence is pangram means check if it has all 26 letters of alphabets in it

// approach :- first we will make a 26 size array and run a loop through the sentence and mark the array with
// corresponding ASCII values (char-'a') , if the sentence has all alphabets then all array indices will be marked and the count will be 26 .... if the count!=26 return false or else true;

// TC:-O(N) , SC:-O(26);



class Solution {
    public boolean checkIfPangram(String sentence) {

        if(sentence.length()<26){
            return false;
        }

        int [] arr = new int[26];
        int count =0;

        for(char ch : sentence.toCharArray()){
            int mark= ch-'a';

            if(arr[mark]==0){
                arr[mark]=1;
                count++;
            }
        }

        if(count!=26){
            return false;
        }

        return true;
    }
}