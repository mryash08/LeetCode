class Solution {
    public boolean checkIfExist(int[] arr) {
        
         HashSet<Integer> set = new HashSet<>();

        for(int i=0; i< arr.length; i++){
            if(arr[i] % 2 == 0){
                if(set.contains(arr[i]*2) || set.contains(arr[i]/2)){
                    return true;
                }else {
                    set.add(arr[i]);
                }
            }else {
                if(set.contains(arr[i]*2)){
                    return true;
                }else {
                    set.add(arr[i]);
                }
            }

        }

            return false; 
    }
        
    
}