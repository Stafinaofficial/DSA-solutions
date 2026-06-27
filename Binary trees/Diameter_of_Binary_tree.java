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
    public int diameterOfBinaryTree(TreeNode root) {
        int heightof=height(root);
        return count;
        
    }
    int count=Integer.MIN_VALUE;
    public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int l=height(root.left);
        int r=height(root.right);
        if((l+r)>count){
            count=l+r;
        }
        return 1+Math.max(l,r);
    }
}
//Time Complexity:O(N)
//Space Complexity:O(log N)
