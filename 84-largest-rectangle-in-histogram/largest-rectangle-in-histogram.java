class Solution {
    public int largestRectangleArea(int[] heights) {

        int[] nse = new int[heights.length];
        int[] pse = new int[heights.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = heights.length-1; i>=0; i--){
            while(stack.size() != 0 && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.size() == 0) nse[i] = heights.length;
            else nse[i] = stack.peek();
            stack.push(i);
        }

        stack.clear();

         for(int i = 0; i<heights.length; i++){
            while(stack.size() != 0 && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.size() == 0) pse[i] = -1;
            else pse[i] = stack.peek();
            stack.push(i);
        }

        int ans =0;
        for(int i=0; i<heights.length; i++){
            ans = Math.max(ans,heights[i] * (nse[i] - pse[i] - 1));
        }


        return ans;
    }
}