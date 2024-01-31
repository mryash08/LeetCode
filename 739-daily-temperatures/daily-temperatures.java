class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<temperatures.length; i++){

            while(st.size() != 0 && temperatures[i] > temperatures[st.peek()]){
                int idx = st.pop();
                ans[idx] = i - idx;
            }
            st.push(i);
        }
        return ans;
    }
}