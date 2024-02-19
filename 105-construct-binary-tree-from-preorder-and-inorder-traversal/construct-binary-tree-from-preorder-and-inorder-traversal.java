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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
         return Helper(preorder,inorder,0,0,preorder.length-1,inorder.length-1);
    }

    public TreeNode Helper(int[] preorder , int[] inorder , int startA , int startB , int endA , int endB){
        if(startB > endB) return null;
        int mid = startB;
        for(int i=startB; i<=endB; i++){
            if(inorder[i] == preorder[startA]){
                mid = i;
                break;
            }
        }
        TreeNode a = new TreeNode(inorder[mid]);
         int ele = mid - startB;
        a.left = Helper(preorder,inorder,startA+1,startB,startA+ele,mid-1);
        a.right = Helper(preorder,inorder,startA+ele+1,mid+1,endA,endB);    
        return a;
    }
}