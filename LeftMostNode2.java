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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode curr = root;
        queue.add(root);
        while(queue.size()>0){
            curr = queue.poll();
            if(curr.right!=null)
                queue.add(curr.right);
            if(curr.left!=null)
                queue.add(curr.left);
        }
        return curr.val;

    }
}