// Write a function that displays the nodes of a tree in level order.
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
class Solution
{
   public List<List<Integer>> levelOrder(TreeNode root)
   {
      List<List<Integer>> order = new ArrayList<>();
      Queue<TreeNode> queue = new LinkedList<>();
        
      if(root == null)
         return order;
        
      queue.add(root);
      while(!queue.isEmpty())
      {
         List<Integer> temp = new ArrayList<>();
         int qSize = queue.size();
            
         for(int i = 0; i < qSize; ++i)
         {
            TreeNode tempNode = queue.peek();
            temp.add(tempNode.val);
                
            if(tempNode.left != null)
               queue.add(tempNode.left);
                
            if(tempNode.right != null)
               queue.add(tempNode.right);
                
            queue.remove();
         }
            
         order.add(temp);
      }
      
      return order;
   }
}