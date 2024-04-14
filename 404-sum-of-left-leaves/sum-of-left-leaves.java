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
    public int sumOfLeftLeaves(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int sum = 0;
        while(queue.size() != 0){
            TreeNode curr = queue.remove();
            if(curr.left != null){
                if(curr.left.left == null && curr.left.right == null) sum += curr.left.val;
                else{
                    queue.add(curr.left);
                    
                }
            }
            if(curr.right != null){
                        queue.add(curr.right);
                    }
        }
        return sum;
    }
}