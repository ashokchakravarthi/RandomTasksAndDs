public class ReverseLevelOrderBinaryTreeTraversal1
{
    TreeNode root;
    void reverseLevelOrder(TreeNode node)
    {
        if(node == null)
        {
            return;
        }

        reverseLevelOrder(node.left);
        reverseLevelOrder(node.right);
        System.out.print(node.data);
    }

    public static void main(String args[])
    {
        ReverseLevelOrderBinaryTreeTraversal1 tree = new ReverseLevelOrderBinaryTreeTraversal1();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);
        tree.reverseLevelOrder(tree.root);
    }
}
