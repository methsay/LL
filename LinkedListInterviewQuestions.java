import java.util.List;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
    }

    static void deleteNode(ListNode node) {
        node.data = node.next.data;
        node.next = node.next.next;
    }

    static void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static ListNode nthNodeFromLast(ListNode head, int pos) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 1; i <= pos; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    static ListNode removeNthNode(ListNode head, int pos) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 1; i <= pos; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            head = head.next;
            return head;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    static int lengthOfLL(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        return len;
    }

    static ListNode intersection(ListNode head) {
        ListNode temp1 = head;
        ListNode temp2 = head;
        int increment = 0;
        int len1 = ListNode.lengthOfLL(temp1);
        int len2 = ListNode.lengthOfLL(temp2);
        if (len1 < len2) {
            increment = len2 - len1;
            while (increment > 0) {
                temp2 = temp2.next;
                increment--;
            }

        } else {
            increment = len1 - len2;
            while (increment > 0) {
                temp1 = temp1.next;
                increment--;
            }
        }
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;

    }

    static int middle(ListNode head) {
        int len = ListNode.lengthOfLL(head);
        ListNode temp = head;
        if (len % 2 == 0) {
            for (int i = 1; i < len / 2; i++) {
                temp = temp.next;
            }
            return temp.data;
        } else {
            for (int i = 1; i <= len / 2; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    static int middleElement(ListNode head) {
        // fast and slow pointer approach
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    static int deleteMiddleElement(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        int len = ListNode.lengthOfLL(head);
        if (len % 2 == 0) {
            while (fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            slow.next = slow.next.next;
            return slow.data;
        } else {
            while (fast.next.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            slow.next = slow.next.next;
            return slow.data;
        }
    }

    static boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (slow == fast)
            return true;
        else
            return false;
    }

    static ListNode merge(ListNode List1, ListNode List2) {
        ListNode temp1 = List1;
        ListNode temp2 = List2;
        ListNode head = new ListNode(100);
        ListNode temp = head;
        while (List1 != null || List2 != null) {
            if (temp1.data < temp2.data) {
                ListNode a = new ListNode(temp1.data);
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
            } else {
                ListNode a = new ListNode(temp2.data);
                temp.next = a;
                temp = a;
                temp2 = temp2.next;
            }
            if (temp1 == null) {
                temp.next = temp2;
            } else {
                temp.next = temp1;
            }
        }
        return head.next;
    }

    static ListNode mergeWithoutExtraSpace(ListNode List1, ListNode List2) {
        ListNode temp1 = List1;
        ListNode temp2 = List2;
        ListNode head = new ListNode(100);
        ListNode temp = head;
        while (temp1 != null || temp2 != null) {
            if (temp1.data < temp2.data) {
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            }
            if (temp1 == null) {
                temp = temp2.next;
            } else {
                temp = temp1.next;
            }
        }
        return head.next;
    }

    static ListNode oddEven(ListNode head) {
        ListNode oddHead = null;
        ListNode oddTail = null;

        ListNode evenHead = null;
        ListNode evenTail = null;

        ListNode temp = head;

        while (temp != null) {
            if (temp.data % 2 == 0) {
                if (oddHead == null) {
                    oddHead = temp;
                    oddTail = temp;
                } else {
                    oddTail.next = temp;
                    oddTail = temp;
                }
            } else {
                if (evenHead == null) {
                    evenHead = temp;
                    evenTail = temp;
                } else {
                    evenTail.next = temp;
                    evenTail = temp;
                }
            }
            if (oddHead == null) {
                return evenHead;
            }
            if (evenTail != null) {
                evenTail.next = null;
            }
        }
        return oddHead;
    }

    static ListNode removeDuplicatesFunc(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.data == temp.next.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;
    }
    static void reverse(ListNode head){
        if(head == null){
            return;
        }
        reverse(head);
        System.out.print(head.data+ " ");
    }
    static ListNode reverseLL(ListNode head){
        if(head.next == null){
            return head;
        }
        ListNode newHead = reverseLL(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    static ListNode iterativeReverse(ListNode head){
        ListNode agla = null;
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        return prev;
    }
    static boolean isPalindrome(ListNode head){
        //step1 : pehle deep copy banao
        ListNode copyHead = null;
        ListNode copyTail = null;
        ListNode temp = head;
        while(temp != null){
            ListNode newNode = new ListNode(temp.data);
            if(copyHead == null){
                copyHead = newNode;
                copyTail = newNode;
            }else{
                copyTail.next = newNode;
                copyTail = newNode;
            }
            temp = temp.next;
        }
        //step2 : aab iss copy ko reverse kardo
        ListNode reversed = reverseLL(copyHead);
        //step3 : aab original list aur reversed list ko compare karet raho
        ListNode p = head;
        ListNode q  = reversed;
        while(p != null){
            if(p.data != q.data){
                return false;
            }
            p = p.next;
            q = q.next;
        }
        return false;
    }
    static boolean isPalindrome2(ListNode head){
        if(head == null || head.next == null){
            return true;
        }
        //step1: middle find karo using fast and slow pointer
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //step2 : second half ko reverse kar do
        ListNode secondHalf = reverseLL(slow);
        //step3: comapre karo firsthalf aur secondhalf
        ListNode firstHalf = head;
        ListNode temp = secondHalf;
        while(temp != null){
            if(firstHalf.data != temp.data){
                return false;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }
        return true;
    }
    static int pairSum(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverseLL(slow.next);
        int maxSum = Integer.MIN_VALUE;
        ListNode head1 = slow.next;
        ListNode head2 = head;
        while(head1 != null){
            int sum = head1.data + head2.data;
            if(sum>maxSum){
                maxSum = sum;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return maxSum;
    }
    static ListNode oddEvenIndices(ListNode head){
        ListNode odd = new ListNode(0);
        ListNode even = new ListNode(0);
        ListNode tempo = odd;
        ListNode tempe = even;
        ListNode temp = head;

        while(temp != null){
            tempo.next = temp;
            temp = temp.next;
            tempo = tempo.next;
            if(temp == null){
                break;
            }
            tempe.next = temp;
            temp = temp.next;
            tempe = tempe.next;
        }
        odd = odd.next;
        even = even.next;
        return odd;
    }
}

public class LinkedListInterviewQuestions {
    public static void main(String[] args) {
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
        System.out.println(ListNode.deleteMiddleElement(a));
        ListNode.display(a);
    }
}