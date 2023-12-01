class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
          int fi = 0; int fj=0;
          int si =0; int sj = 0;
          while(fi < word1.length && si < word2.length){

              if(word1[fi].charAt(fj) == word2[si].charAt(sj)){
                  fj++;
                  sj++;
              }else{
                  return false;
              }
               if(fj >= word1[fi].length()){
                  fi++;
                  fj=0;
              }
              if(sj >= word2[si].length()){
                  si++;
                  sj=0;
              }
          }
          if(fi >= word1.length && si >= word2.length) return true;
          return false;
    }
}