
public class Implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

        public static class linkedlist {
            Node head = null;
            Node tail = null;

            void insertAtEnd(int val) {
                Node temp = new Node(val);
                if (head == null) {
                    head = temp;
                } else {
                    tail.next = temp;
                }
                tail = temp;
            }

            void display() {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
            }
            int size(){
                int count = 0;
                Node temp = head;
                while(temp != null){
                    count++;
                    temp = temp.next;
                }
                return count;
            }
        }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(7);
        ll.insertAtEnd(8);
        ll.display();
        ll.size();
    }
}
