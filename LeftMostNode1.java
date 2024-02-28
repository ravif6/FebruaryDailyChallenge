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
    private int maxDepth;
    private TreeNode bottomLeft; // we can store direct value rather than NOde here
    public int findBottomLeftValue(TreeNode root) {
        maxDepth =-1;
        bottomLeft = root;
        dfs(root,0);        
        return bottomLeft.val;
    }
    private void dfs(TreeNode root,int depth)
    {
        if(root==null)
        return;
        if(depth>maxDepth){
            maxDepth = depth;
            bottomLeft = root;
        }

        dfs(root.left,depth+1);
        dfs(root.right,depth+1);
    }
}