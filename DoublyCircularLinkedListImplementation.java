public class DoublyCircularLinkedListImplementation {
    static class Node{ //Doubly Linked List Class
        int val;
        Node next;
        Node prev;
        Node(int val){ //constructor
            this.val = val;
        }
    }
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayrev(Node tail){
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void displayRandom(Node random){
        Node temp = random;
        while(temp.prev != null){
            temp = temp.prev;
        }
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node insertAtHead(Node head, int value){
        Node temp = new Node(30);
        temp.next = head;
        head.prev = temp;
        temp.prev = null;
        head = temp;
        return head;

    }
    public static Node insertAtTail(Node tail, int value){
        Node temp = new Node(value);
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
        return tail;
    }
    public static void main(String[] args) {
        // 4 10 2 99 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        display(a);
        // displayrev(e);
       // displayRandom(d);
       //Node newHead = insertAtHead(a, 30);
      // display(newHead);
      Node newTail = insertAtTail(e, 50);
      displayrev(newTail);
    }
}
