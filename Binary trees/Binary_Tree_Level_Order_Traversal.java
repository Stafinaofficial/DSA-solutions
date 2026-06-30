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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> tree=new LinkedList<>();
        tree.offer(root);
        while(!tree.isEmpty()){
            int n=tree.size();
            ArrayList<Integer> internal=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode node=tree.poll();
                internal.add(node.val);
                if(node.left != null){
                    tree.offer(node.left);
                }
                if(node.right != null){
                    tree.offer(node.right);
                }
            }
            list.add(internal);
        }
        return list;
    }
}
