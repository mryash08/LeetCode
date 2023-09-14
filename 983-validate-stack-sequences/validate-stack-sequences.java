class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

       int j=0; int i=0;
        while(j < popped.length-1){
            if(pushed[i] == popped[j]){
                pushed[i] = -1;
                do{
                    i--;
                }while(i >= 0 && pushed[i] == -1);
                j++;
                if(i < 0) i = j;
            }else{
                do{
                    i++;
                } while(i < pushed.length-1 && pushed[i] == -1);
            }
            if(i > pushed.length-1) return false;
        }
        return true;
    }
}