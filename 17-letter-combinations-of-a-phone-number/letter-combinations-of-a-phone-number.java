class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");

       List<String> ans = new ArrayList<>();
        if(digits.length() == 1){
            String a = map.get(digits.charAt(0)-'0');
            for(int i=0; i<a.length(); i++){
                ans.add("" + a.charAt(i));
            }
        }
         if(digits.length() == 2){
            String a = map.get(digits.charAt(0)-'0');
            String b = map.get(digits.charAt(1)-'0');
            for(int i=0; i<a.length(); i++){
                for(int j=0; j<b.length(); j++){
                   ans.add("" + a.charAt(i) + b.charAt(j));
                }
                
            }
        }
        if(digits.length() == 3){
            String a = map.get(digits.charAt(0)-'0');
            String b = map.get(digits.charAt(1)-'0');
            String c = map.get(digits.charAt(2)-'0');
            for(int i=0; i<a.length(); i++){
                for(int j=0; j<b.length(); j++){
                    for(int k=0; k<c.length(); k++){
                        ans.add("" + a.charAt(i) + b.charAt(j) + c.charAt(k));
                    }
                }
                
            }
        }
        if(digits.length() == 4){
            String a = map.get(digits.charAt(0)-'0');
            String b = map.get(digits.charAt(1)-'0');
            String c = map.get(digits.charAt(2)-'0');
            String d = map.get(digits.charAt(3)-'0');
            for(int i=0; i<a.length(); i++){
                for(int j=0; j<b.length(); j++){
                    for(int k=0; k<c.length(); k++){
                        for(int l=0; l<d.length(); l++){
                           ans.add("" + a.charAt(i) + b.charAt(j) + c.charAt(k) + d.charAt(l));
                        }
                    }
                }
                
            }
        }
        return ans;
    }
}