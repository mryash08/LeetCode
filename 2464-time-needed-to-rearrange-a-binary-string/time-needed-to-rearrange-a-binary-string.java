class Solution {
    public int secondsToRemoveOccurrences(String s) {
        char[] arr = s.toCharArray();
        boolean flag = true;
        int count = 0;
        while(flag){
            flag = false;
            for(int i=1; i<arr.length; i++){
                 if(arr[i] == '1' && arr[i-1] == '0'){
                     arr[i] = '0';
                     arr[i-1] = '1';
                     flag = true;
                     i++;
                 }
            }
            count++;
        }
        return count-1;
    }
}