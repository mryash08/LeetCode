class Solution {
    public boolean isOneBitCharacter(int[] bits) {

        int last = -1;
        for(int i=0; i<bits.length; i++){
            if(bits[i] == 0){
                last = 0;
            }else{
                last = 1;
                i++;
            }
        }
        
        if(last == 0){
            return true;
        }else{
            return false;
        }
        
    }
}