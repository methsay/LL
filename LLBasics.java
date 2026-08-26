class LLBasics{
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    static void printLinkedList(Node head)
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        head.next = b;
        b.next = c;
        c.next = d;
        printLinkedList(head);
    }
}