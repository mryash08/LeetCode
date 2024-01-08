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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int ans = 0;
        Queue<TreeNode> temp = new ArrayDeque<>();
        temp.add(root);
        while(temp.size() != 0){
             TreeNode t = temp.peek();
             if(t.left != null) temp.add(t.left);
             if(t.right != null) temp.add(t.right);
             if(t.val >= low && t.val <= high) ans += t.val;
             temp.remove();
        }
        return ans;
    }
}