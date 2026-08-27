
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
            void insertAtStart(int val){
                Node temp = new Node(val);
                if(head == null){
                    head = tail = temp;
                }
                else{
                    temp.next = head;
                    head = temp;
                }
            }

            void insertAtEnd(int val) {
                Node temp = new Node(val);
                if (head == null) {
                    head = temp;
                } else {
                    tail.next = temp;
                }
                tail = temp;
            }
            void insertAtAny(int pos,int val){
                Node naya = new Node(val);
                Node temp = head;
                if(pos == size()){
                    insertAtEnd(val); return;
                }
                if(pos==0){
                    insertAtStart(val); return;
                }
                else if(pos < 0 || pos > size()){
                    System.out.println("Wrong Input"); return;
                }
                for(int i = 1; i < pos - 1; i++)
                {
                    temp = temp.next;
                }
                naya.next = temp.next;
                temp.next = naya;
            }
            int getElementByPos(int pos){
                if(pos < 0 || pos > size()){
                    System.out.println("Wrong Input"); return -1;
                }
                Node temp = head;
                for(int i = 0; i < pos; i++){
                    temp = temp.next;
                }
                return temp.data;
            }
            void deleteAtIndex(int pos){
                Node temp = head;
                if(pos < 0 || pos > size()){
                    System.out.println("Wrong Input"); return ;
                }
                if(pos == 0){
                    head = head.next;
                }
                if(pos == size()){
                    tail = temp;
                }
                for(int i = 0; i < pos; i++)
                {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
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
        ll.insertAtAny(0, 3);
        System.out.println();
        ll.display();
        System.out.println("Head = "+ll.head.data);
        System.out.println("the element = "+ll.getElementByPos(1));
    }
}
