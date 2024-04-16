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
                   if(level+1 == depth){
                      TreeNode newLeft = new TreeNode(val);
                      TreeNode newRight = new TreeNode(val);
                      newLeft.left = queue.peek().left;
                      newRight.right = queue.peek().right;
                      queue.peek().left = newLeft;
                      queue.remove().right = newRight;
                   }else{
                      if(queue.peek().left != null) queue.add(queue.peek().left);
                      if(queue.peek().right != null) queue.add(queue.peek().right);
                      queue.remove();
                   }
              }
              level++;
         }
         return root;
    }
}