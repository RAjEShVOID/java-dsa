class Solution {
    public boolean detectCapitalUse(String word) {
        char [] ch= word.toCharArray();
        int countCapital=0;

        for(int i=0 ; i<ch.length ; i++){
            if(Character.isUpperCase(ch[i]) == true){
                countCapital++;
            }
        }

        if(countCapital == ch.length){return true;}
        if(countCapital == 0){return true;}

        if( (countCapital == 1) && (Character.isUpperCase(ch[0]))  ){return true;}

        return false;

    }
}