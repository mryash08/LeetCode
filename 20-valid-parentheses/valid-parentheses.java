class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i == ')' || i == '}' || i == ']') {
                if (st.size() != 0 && ((i == ')' && st.peek() == '(') || (i == '}' && st.peek() == '{')
                        || (i == ']' && st.peek() == '['))) {
                    st.pop();
                } else {
                    return false;
                }
            } else {
                st.push(i);
            }
        }
        if (st.size() != 0)
            return false;
        return true;
    }
}