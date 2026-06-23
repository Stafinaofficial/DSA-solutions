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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        inorderTraversal(root,list);
        return list;
    }
    void inorderTraversal(TreeNode root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        inorderTraversal(root.left,arr);
        arr.add(root.val);
        inorderTraversal(root.right,arr);
    }

}

//Time Complexity: O(N)
//Space Complexity: O(log N)
