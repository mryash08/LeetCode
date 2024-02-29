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
    public class pair{
        TreeNode root;
        int level;

        pair(TreeNode root, int level){
            this.root = root;
            this.level = level;
        }
    }
    public boolean isEvenOddTree(TreeNode root) {
        Queue<pair> queue = new ArrayDeque<>();
         queue.add(new pair(root,0));
         int prev = 0; int Clevel = -1;
        while(!queue.isEmpty()){
              int l = queue.peek().level;
              TreeNode temp = queue.peek().root;
             if(temp.left != null){
                 queue.add(new pair(temp.left,l+1));
             }
             if(temp.right != null){
                 queue.add(new pair(temp.right,l+1));
             }
             if(l % 2 == 0 && temp.val % 2 == 0 || l % 2 == 1 && temp.val % 2 == 1) return false;
             if(Clevel != l){
                 prev = temp.val;
                 Clevel = l;
             }else{
                 if(l % 2 == 1){
                      if(prev > temp.val) prev = temp.val;
                      else return false;
                 }else{
                      if(prev < temp.val) prev = temp.val;
                      else return false;
                 }
                
             }
             queue.remove();
        }
        return true;
    }
}