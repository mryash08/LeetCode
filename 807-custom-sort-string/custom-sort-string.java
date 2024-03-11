class Solution {
    public String customSortString(String order, String s) {
        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
        }
        StringBuilder str = new StringBuilder();
        for(int i=0; i<order.length(); i++){
            int temp = (order.charAt(i) - 'a');
            while(arr[temp] != 0){
                str.append(order.charAt(i));
                arr[temp]--;
            }
        }
        for(int i=0; i<arr.length; i++){
            while(arr[i] != 0){
                str.append((char)(i+'a'));
                arr[i]--;
            }
        }
        return str.toString();
    }
}