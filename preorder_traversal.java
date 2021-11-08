// Given an n-ary tree and some queries for the tree, write a function that prints the preorder traversal of the subtree rooted to a given node.
class Solution
{
   private void preorderRecurse(Node root, List<Integer> ret)
   {
      if(root == null)
         return;
        
      ret.add(root.val);
      for(int i = 0; i < root.children.size(); ++i)
         preorderRecurse(root.children.get(i), ret);
    }
    
   public List<Integer> preorder(Node root)
   {
      List<Integer> ret = new ArrayList<>();
      preorderRecurse(root, ret);
      return ret;
   }
}