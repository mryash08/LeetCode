class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder str = new StringBuilder(s);
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '('){
                st.push(i);
            }else if(str.charAt(i) == ')'){
                if(st.size() != 0 && str.charAt(st.peek()) == '('){
                    st.pop();
                }else{
                    str.delete(i,i+1);
                    i--;
                }
            }
        }
        int count = 0;
        while(st.size() != 0){
            str.delete(st.peek()-count,st.peek()-count+1);
            st.pop();
        }
        return str.toString();
    }
}