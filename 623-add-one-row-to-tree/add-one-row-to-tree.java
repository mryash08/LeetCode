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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
         Queue<TreeNode> queue = new LinkedList<>();
         if(depth == 1){
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
         }
         queue.add(root);
         int level = 1;
         while(!queue.isEmpty()){
              int size = queue.size();
              while(size-- > 0){
                TreeNode curr  = queue.remove();
                   if(level+1 == depth){
                      TreeNode newLeft = new TreeNode(val);
                      TreeNode newRight = new TreeNode(val);
                      newLeft.left = curr.left;
                      newRight.right = curr.right;
                      curr.left = newLeft;
                      curr.right = newRight;
                   }else{
                      if(curr.left != null) queue.add(curr.left);
                      if(curr.right != null) queue.add(curr.right);
                   }
              }
              level++;
              if(level == depth) return root;
         }
         return root;
    }
}