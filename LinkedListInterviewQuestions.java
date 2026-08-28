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
}

public class LinkedListInterviewQuestions{
    public static void main(String[] args) {
        //pass the node which you want to delete //leetcode237
    }
}