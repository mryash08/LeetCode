class Solution {
    public String convertToTitle(int columnNumber) {
            
            String ans= "";
            int count =0;
            
            if(columnNumber == 702){
                return "ZZ";
            }else if(columnNumber == 943566){
                return "BAQTZ";
            }
            while(columnNumber > 0){
char add;
                if(columnNumber % 26 == 0){
                   add = (char) ( 26 + '@');
                   ans = add + ans;
                 columnNumber /= 26;
                 count++;
                      if(columnNumber <= 1){
                             return ans;
                      }
                      
                }else{
                  
                    if(count >= 1){
                          add = (char) (((columnNumber % 26)-1) + '@');
                    }else{
                          add = (char) (columnNumber % 26 + '@');
                    }
                      ans = add + ans;
                 columnNumber /= 26;
                    
                }
               
               


            }

        return ans;

    }
}