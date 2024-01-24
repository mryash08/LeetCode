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
    public int pseudoPalindromicPaths (TreeNode root) {
        return PalindromicHelper(root,new int[10],0);
    }
    public int PalindromicHelper(TreeNode root,int[] freq,int count){
        freq[root.val]++; count++;

        if(root.left == null && root.right == null){
            int mistake = 0;
            for(int i=0; i<freq.length; i++){
                if(freq[i] % 2 == 1) mistake++;
            }
            if(count % 2 == 1 && mistake == 1){
                freq[root.val]--;
                return 1;
            }else if(count % 2 == 0 && mistake == 0){
                 freq[root.val]--;
                 return 1;
            }else{
                freq[root.val]--;
                return 0;
            }
        }
         int a = 0; int b = 0;
        if(root.left != null){
             a = PalindromicHelper(root.left,freq,count);
        }
        if(root.right != null){
             b = PalindromicHelper(root.right,freq,count);
        }
        
        freq[root.val]--;
        return a+b;
    }
}