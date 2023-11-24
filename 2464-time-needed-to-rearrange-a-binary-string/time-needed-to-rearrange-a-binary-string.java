class Solution {
    public int secondsToRemoveOccurrences(String s) {
        char[] arr = s.toCharArray();
        int count0 = 0;
        int waitTime = 0;
        int end = 0;
        if(!s.contains("01")) return 0;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] == '1'){
                end = i;
                break;
            }
        }
        
        for(int i=0; i<end; i++){
            if(arr[i] == '0'){
                count0++;
                if(arr[i+1] == '0' && waitTime > 0){
                    waitTime--;
                }
            }else{
                if(count0 != 0 && arr[i+1] == '1'){
                    waitTime++;
                }
            }
        }
        return count0+waitTime;
    }
}