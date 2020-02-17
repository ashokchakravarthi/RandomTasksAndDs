// Java program to find n'th node from end using slow and
// fast pointers
public class FindNthElementFromEnd
{
    Node head; // head of the list
    void printNthFromLast(int n)
    {
        Node main_ptr = head;
        Node ref_ptr = head;
        int count = 0;
        while (count < n)
        {
            if (ref_ptr == null)
            {
                System.out.println(n + " is greater than the no of nodes in the list");
                return;
            }

            ref_ptr = ref_ptr.next;
            count++;
        }

        while (ref_ptr != null)
        {
            main_ptr = main_ptr.next;
            ref_ptr = ref_ptr.next;
        }

        System.out.println("Node no. " + n + " from last is " + main_ptr.value);
    }

    /*Drier program to test above methods */
    public static void main(String[] args)
    {
        FindNthElementFromEnd llist = new FindNthElementFromEnd();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);

        llist.printNthFromLast(4);
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
}
