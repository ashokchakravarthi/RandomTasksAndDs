public class SortedArraytoBinarySearchTree
{

    static TreeNode root;
    static TreeNode sortedArrayToBST(int arr[], int start, int end)
    {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = sortedArrayToBST(arr, start, mid - 1);
        node.right = sortedArrayToBST(arr, mid + 1, end);

        return node;
    }

    static void preOrder(TreeNode node)
    {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        root = sortedArrayToBST(arr, 0, n - 1);
        System.out.println("Preorder traversal of constructed BST");
        preOrder(root);
    }
}

class TreeNode
{
    int data;
    TreeNode left, right;
    TreeNode(int data)
    {
        this.data = data;
    }
}