class Solution {
    public int findSpecialInteger(int[] arr) {
        int length = arr.length/4;
        for(int i=0; i<arr.length-length; i++){
            if(arr[i] == arr[i+length]) return arr[i];
        }
        return arr[0];
    }
}