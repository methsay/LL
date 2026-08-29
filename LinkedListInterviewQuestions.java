class ListNode{
    int data;
    ListNode next;
    ListNode(int data){
        this.data = data;
    }
    static void deleteNode(ListNode node){
        node.data = node.next.data;
        node.next = node.next.next;
    }
    static void display(ListNode head)
    {
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    static ListNode nthNodeFromLast(ListNode head, int pos ){
        ListNode fast = head;
        ListNode slow = head;
        for(int i = 1; i <= pos; i++){
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    static ListNode removeNthNode(ListNode head,int pos){
        ListNode fast = head;
        ListNode slow = head;
        for(int i = 1; i <= pos; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow= slow.next;
        }
        slow.next = slow.next.next;
        return slow;
    }
}

public class LinkedListInterviewQuestions{
    public static void main(String[] args) {
        //pass the node which you want to delete //leetcode237
        ListNode a = new ListNode(100);
        ListNode b = new ListNode(13);
        ListNode c = new ListNode(4);
        ListNode d = new ListNode(5);
        ListNode e = new ListNode(12);
        ListNode f = new ListNode(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        ListNode.display(a);
        ListNode.removeNthNode(a, 2);
        ListNode.display(a);
    }
}