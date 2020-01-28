import javax.swing.undo.UndoableEdit;

public class ReverseLinkedList1
{
    public static void main(String[] arg)
    {
        Node head = new Node(1);
        Node node = new Node(2);
        head.next = node;
        node = new Node(3);
        head.next.next = node;
        node = new Node(4);
        head.next.next.next = node;
        node = new Node(5);
        head.next .next.next.next= node;
        traverse(head);
        head = reverse(head);
        traverse(head);
    }

    public static void traverse(Node head)
    {
        for(Node node = head; node!= null; node= node.next)
        {
            System.out.print(node.value + " -> ");
        }
        System.out.print("null");
        System.out.println();
    }

    public static Node reverse(Node head)
    {
        Node current = head, prev = null;
        Node next;
        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}