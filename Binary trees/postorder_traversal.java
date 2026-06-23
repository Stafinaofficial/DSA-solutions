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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        postorderTraversal(root,list);
        return list;
    }
    void postorderTraversal(TreeNode root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }

        postorderTraversal(root.left,arr);
        postorderTraversal(root.right,arr);
        arr.add(root.val);
    }
}

//Time Complexity: O(N)
//Space Complexity: O(log N)
