public class ReverLinkedList
{
    static Node newHead = null;
    static Node reverseLinkedList(Node head)
    {
        if(head.next == null)
        {
            newHead = head;
            return null;
        }

        reverseLinkedList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args)
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        print(head);
        head = reverseLinkedList(head);
        print(head);
    }

    static void print(Node head)
    {
        for(Node node = head; node != null; node = node.next)
        {
            System.out.print(node.value+ " -> ");
        }

        System.out.println("null");
    }
}

class Node
{
    int value;
    Node next;
    Node(int value)
    {
        this.value = value;
        next = null;
    }
}