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
    int ans = 0; int level = -1;
    public int findBottomLeftValue(TreeNode root) {
        Helper(root,0);
        return ans;
    }

    public void Helper(TreeNode root,int l){
         if(root == null) return;
         if(l > level){
             ans = root.val;
             level = l;
         } 
         Helper(root.left,l+1);
         Helper(root.right,l+1);
    }
}