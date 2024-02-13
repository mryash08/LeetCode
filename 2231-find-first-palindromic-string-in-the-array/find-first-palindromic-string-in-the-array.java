class Solution {
    public String firstPalindrome(String[] words) {
         for(int i=0; i<words.length; i++){
             if(check(words[i].toCharArray())){
                 return words[i];
             }
         }
         return "";
    }

    public boolean check(char[] word){
         int i=0; int j=word.length-1;
         while(i < j){
             if(word[i] != word[j]){
                 return false;
             }
             i++;
             j--;
         }
         return true;
    }
}