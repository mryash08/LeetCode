class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        int left = 0;
        int right = 0;
        StringBuilder s1 = new StringBuilder(s);
        StringBuilder t1 = new StringBuilder(t);
        while(left < s1.length() && right < t1.length()){
             if(left != 0 && s1.charAt(left) == '#'){
                 s1.deleteCharAt(left);
                 s1.deleteCharAt(left-1);
                 left-=2;
             }else if(left == 0 && s1.charAt(left) == '#'){
                 s1.deleteCharAt(left);
                 left-=1;
             }
             if(right != 0 && t1.charAt(right) == '#'){
                 t1.deleteCharAt(right);
                 t1.deleteCharAt(right-1);
                 right-=2;
             }else if(right == 0 && t1.charAt(right) == '#'){
                 t1.deleteCharAt(right);
                 right-=1;
             }

             left++;
             right++;
        }

        while(left < s1.length()){
            if(left != 0 && s1.charAt(left) == '#'){
                 s1.deleteCharAt(left);
                 s1.deleteCharAt(left-1);
                 left-=2;
             }else if(left == 0 && s1.charAt(left) == '#'){
                 s1.deleteCharAt(left);
                 left-=1;
             }
             left++;
        }

        while(right < t1.length()){
            if(right != 0 && t1.charAt(right) == '#'){
                 t1.deleteCharAt(right);
                 t1.deleteCharAt(right-1);
                 right-=2;
             }else if(right == 0 && t1.charAt(right) == '#'){
                 t1.deleteCharAt(right);
                 right-=1;
             }
             right++;
        }

       if(s1.toString().equals(t1.toString())) return true;
        return false;
       
    }
}