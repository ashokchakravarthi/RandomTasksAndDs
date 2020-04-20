import java.util.LinkedList;
import java.util.Queue;

public class TreeLevelOrder
{
    static void traverse(TreeNode root)
    {
        Queue<TreeNode> toVisit = new LinkedList<>();
        toVisit.add(root);
        while(!toVisit.isEmpty())
        {
            if(root == null) return;
            TreeNode curr = toVisit.remove();
            System.out.print(curr.data);
            if(curr.left != null) toVisit.add(curr.left);
            if(curr.right != null) toVisit.add(curr.right);
        }
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        traverse(root);

    }
}
