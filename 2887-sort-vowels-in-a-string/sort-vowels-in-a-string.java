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
        StringBuilder ans = new StringBuilder();
        int idx = 64;
        for(int i=0; i<s.length(); i++){
            while(arr[idx] == 0 && idx < 122){
                idx++;
            }
            if(list.contains(s.charAt(i))){
                ans.append((char)(idx));
                arr[idx]--;
            }else{
                ans.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}