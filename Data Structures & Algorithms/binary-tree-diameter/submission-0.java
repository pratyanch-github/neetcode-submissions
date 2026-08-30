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

    int diam =0; 
    int height(TreeNode root)
    {
        if(root==null) return 0;
        else {
            int lh = height(root.left);
            int rh = height(root.right);
            diam = Math.max(diam, lh+rh); 
            return Math.max(lh,rh)+1;
        }
    }

    public int diameterOfBinaryTree(TreeNode root) {
        // for each node calculate left height and right height 
        // height of a node is max of (left height , right height) +1
        height(root);
        return diam;

    }
}
