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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
         List<Integer> root1Leaf = findList(root1,new ArrayList<>());
         List<Integer> root2Leaf = findList(root2,new ArrayList<>());
         return root1Leaf.equals(root2Leaf);
    }
    public List<Integer> findList(TreeNode root,List<Integer> list){
             if(root.left == null && root.right == null){
                 list.add(root.val);
                 return list;
             } 
             if(root.left != null){
                 findList(root.left,list);
             }
             if(root.right != null){
                 findList(root.right,list);
             }
             return list;  
    }
}