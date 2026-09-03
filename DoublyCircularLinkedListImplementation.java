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
        Node temp = new Node(value); //when tail node is given
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
        return tail;
    }
    public static Node insertAtAnyIndex(Node head , int idx , int value){
        Node t = head;
        for(int i = 0; i < idx; i++){ // 0 based indexing
            t = t.next;
        }
        Node temp = new Node(value);
        Node after = t.next;
        t.next = temp;
        temp.prev = t;
        temp.next = after;
        if(after != null){
            after.prev = temp;
        }
        return head;
    }
    public static Node deleteHead(Node head){
        head = head.next;
        head.prev = null;
        return head;
    }
    public static Node deleteTail(Node head){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp = temp.prev;
        temp.next = null;
        return head;
    }
    public static Node deleteAtAnyIndex(Node head , int index){
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        return head;
    }
    public static void displayCLL(Node head){
        int len = lengthC(head);
        Node temp = head;
        for(int i = 0; i < len; i++){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static int lengthC(Node head){
        Node temp = head.next;
        int count = 1;
        while(temp!= head){
            count++;
            temp = temp.next;
        }
        return count;
    } 
    public static Node deleteCHead(Node head){
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = head.next;
        head = head.next;
        return head;
    }
    public static boolean palindromeDLL(Node head){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node t = temp;
        Node h = head;
        while(h != t){
            if(h.val != t.val){
                return false;
            }
            h = h.next;
            t = t.prev;
        }
        return true;
    }
    public static void twoSum(Node head , int target){ //assume that the list is in sorted order
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Node t = temp;
        Node h = head;
        while(h.val < t.val){
            if(h.val + t.val == target){
                System.out.print("Target found " + h.val + " and " + t.val);
                return;
            }
            if(h.val + t.val < target){
                h = h.next;
            }
            if(h.val + t.val > target){
                t = t.prev;
            }
            else{
                System.out.println("Target not found !!!");
            }
        }
    }
    public static void main(String[] args) {
        // 4 10 2 99 13
        // Node a = new Node(4);
        // Node b = new Node(10);
        // Node c = new Node(2);
        // Node d = new Node(99);
        // Node e = new Node(13);
        
        //Two Sum
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(13);
        Node e = new Node(100);


        //Palindrome
        // Node a = new Node(1);
        // Node b = new Node(2);
        // Node c = new Node(3);
        // Node d = new Node(1);
        
        //Doubly Linked List
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

        //Palindrome
        // a.prev = null;
        // a.next = b;
        // b.prev = a;
        // b.next = c;
        // c.prev = b;
        // c.next = d;
        // d.prev = c;
        // d.next = null;

        // a.next = b;
        // b.next = c;
        // c.next = d;
        // d.next = e;
        // e.next = a;
        // display(a);
        // displayrev(e);
       // displayRandom(d);
       //Node newHead = insertAtHead(a, 30);
      // display(newHead);
    //   Node newTail = insertAtTail(e, 50);
    //   displayrev(newTail);
    // Node newList = insertAtAnyIndex(a, 2, 70);
    // insertAtAnyIndex(a, 1, 7);
    // display(a);
    // Node deleteH = deleteHead(a);
    // display(deleteH);
    // Node deleteT = deleteTail(a);
    // display(deleteT);
    // Node deleteIdx = deleteAtAnyIndex(a,1);
    // display(deleteIdx);
    // displayCLL(a);
    // Node deleteCircularHead = deleteCHead(a);
    // displayCLL(deleteCircularHead);
    // System.out.print("Length of the circular linked list = " + lengthC(a));
    // boolean ans = palindromeDLL(a);
    // System.out.println("Is the list Palindrome ? "+ans);
    twoSum(a, 16);
    }
}
