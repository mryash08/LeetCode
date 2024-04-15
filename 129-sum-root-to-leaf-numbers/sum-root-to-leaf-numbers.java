/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumNumbers(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        int ans = 0;
        int num = 0;
        TreeNode curr = root;
        TreeNode prev = null;
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                num = num * 10 + curr.val;
                curr = curr.left;
            }
            curr = stack.peek();
            if(curr.right != null && curr.right != prev) curr = curr.right;
            else{ 
                if(curr.left == null && curr.right == null) ans += num;
                 num /= 10;
                 prev = stack.pop();
                 curr = null;
            } 
        }
        return ans;
    }
}