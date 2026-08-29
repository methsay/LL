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
}

public class LinkedListInterviewQuestions{
    public static void main(String[] args) {
        //pass the node which you want to delete //leetcode237
    }
}