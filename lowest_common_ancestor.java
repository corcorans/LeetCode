/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution
{
   // https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
   private TreeNode tree = null;
    
   private boolean recurseTreeNode(TreeNode node, TreeNode p, TreeNode q)
   {
      if(node == null)
         return false;
        
      int left = this.recurseTreeNode(node.left, p, q) ? 1 : 0;
      int right = this.recurseTreeNode(node.right, p, q) ? 1 : 0;
      int mid = (node == p || node == q) ? 1 : 0;
        
      if(left + right + mid >= 2)
         this.tree = node;
        
      return(left + right + mid > 0);
   }
    
   public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
   {
      this.recurseTreeNode(root, p, q);
      return this.tree;
   }
}