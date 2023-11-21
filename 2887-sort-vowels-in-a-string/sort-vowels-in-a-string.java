class Solution {
    public String sortVowels(String s) {
        int[] arr = new int[123];
        char[] arr1 = {'a','e','i','o','u','A','E','I','O','U'};
        List<Character> list = new ArrayList<Character>();
        for (char c:arr1) {
            list.add(c);
        }
        for(int i=0; i<s.length(); i++){
            if(list.contains(s.charAt(i))){
                arr[s.charAt(i)]++;
            }
        }
        String ans = "";
        int idx = 0;
        for(int i=0; i<s.length(); i++){
            while(arr[idx] == 0 && idx < 122){
                idx++;
            }
            if(list.contains(s.charAt(i))){
                ans += (char)(idx);
                arr[idx]--;
            }else{
                ans += s.charAt(i);
            }
        }

        return ans;
    }
}