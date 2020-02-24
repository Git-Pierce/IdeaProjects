package Ch16LinkedList;

public class ListNode {
     int data;
     ListNode next;

     public ListNode(int data){   //constructor 1
          this.data = data;
          this.next = null;
     }
     public ListNode(int data, ListNode next){   //constructor 1
          this.data = data;
          this.next = next;
     }
}
