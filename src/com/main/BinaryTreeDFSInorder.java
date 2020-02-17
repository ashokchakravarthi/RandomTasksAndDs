public class BinaryTreeDFSInorder
{
    public static void main(String[]  args)
    {
        TreeNode head = new TreeNode(10);
        TreeNode left = new TreeNode(8);
        TreeNode right = new TreeNode(14);
        head.left = left;
        head.right = right;
        head.left.left = new TreeNode(5);
        head.left.right = new TreeNode(9);
        head.left.left.left = new TreeNode(4);
        head.left.left.right = new TreeNode(7);
        head.right.left = new TreeNode(13);
        head.right.right = new TreeNode(18);
        traverse(head);
    }

    public static void traverse(TreeNode node)
    {
        if(node == null)
        {
            return;
        }

        traverse(node.left);
        System.out.println(node.data);
        traverse(node.right);
    }
}