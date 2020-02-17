class ReverseLevelOrderBinaryTreeTraversal
{
    TreeNode root;
    /* Function to print REVERSE level order traversal a tree*/
    void reverseLevelOrder(TreeNode node)
    {
        int h = height(node);
        int i;
        for (i = h; i >= 1; i--) //THE ONLY LINE DIFFERENT FROM NORMAL LEVEL ORDER
        {
            printGivenLevel(node, i);
        }
    }

    /* Print nodes at a given level */
    void printGivenLevel(TreeNode node, int level)
    {
        if (node == null)
            return;
        if (level == 1)
            System.out.print(node.data + " ");
        else if (level > 1)
        {
            printGivenLevel(node.left, level - 1);
            printGivenLevel(node.right, level - 1);
        }
    }

    /* Compute the "height" of a tree -- the number of nodes along the longest path from the root node down to the farthest leaf node.*/
    int height(TreeNode node)
    {
        if (node == null)
            return 0;
        else
        {
            /* compute the height of each subtree */
            int lheight = height(node.left);
            int rheight = height(node.right);

            /* use the larger one */
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }

    public static void main(String args[])
    {
        ReverseLevelOrderBinaryTreeTraversal tree = new ReverseLevelOrderBinaryTreeTraversal();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        tree.root.right.left = new TreeNode(6);
        tree.root.right.right = new TreeNode(7);
        tree.root.left.left.left = new TreeNode(8);
        tree.root.left.left.right = new TreeNode(9);
        tree.root.left.right.left = new TreeNode(10);
        tree.root.left.right.right = new TreeNode(11);
        tree.root.right.left.left = new TreeNode(12);
        tree.root.right.left.right = new TreeNode(13);
        tree.root.right.right.left = new TreeNode(14);
        tree.root.right.right.right = new TreeNode(15);
        tree.reverseLevelOrder(tree.root);
    }
}