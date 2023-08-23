class Solution {
    public boolean validMountainArray(int[] arr) {

         int count = 0;

         if(arr.length <= 2){
             return false;
         }
         if(arr[0] > arr[1]){
             return false;
         }
         

        for(int i=0; i<arr.length-1; i++){
              
              if(count == 0 && arr[i] > arr[i+1]){
                   count++;
              }else if(arr[i] == arr[i+1] || count == 1 && arr[i] < arr[i+1]){
                   return false;
              }
        }
        
        if(count ==0){
            return false;
        }
        return true;
        
    }
}