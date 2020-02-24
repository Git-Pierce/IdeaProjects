package Ch16LinkedList;
import java.util.*;

public class LLSimple {
    public static void main(String[] args) {
//        ListNode list = new ListNode();
//        list.data = 42;
//        list.next = new ListNode();  //next node
//        list.next.data = -3;
//        list.next.next = new ListNode();

//
//        //list.next.next.data = 17;
//        //list.next.next.next = null;
//        System.out.println(list.data + " " + list.next.data + " " + list.next.next.data);
        // 42 -3 17    }
        System.out.println("List 0 - Building lists using ListNode class...");
        ListNode list = new ListNode(42);

        list.next = new ListNode(-3);  //next node
        list.next.next = new ListNode(17);
        System.out.println(list.data + " " + list.next.data + " " + list.next.next.data);

        System.out.println("List 1 - Building lists using ListNode constructors...");
        ListNode list1 = new ListNode(10);
        list1.next = new ListNode(20);  //next node
        list1.next.next = new ListNode(30);
        System.out.println(list1.data + " " + list1.next.data + " " + list1.next.next.data);

        // insert nodes at the end
        System.out.println("List 2 - Insert nodes at the end...");
        ListNode list2 = new ListNode((1));
        list2.next = new ListNode(2);
        System.out.println(list2.data + "-> " + list2.next.data +"-> " + list2.next.next);
        // insert a 3 at the end
        list2.next.next = new ListNode(3);
        System.out.println("Insert at end: " + " " + list2.data + "-> " + list2.next.data + "-> "+ list2.next.next.data);
        // insert 3 at the beginning
        System.out.println("List 3 - Insert at beginning...");
        ListNode list3 = new ListNode((1));
        list3.next = new ListNode(2);
        System.out.println("build list3: "+list3.data + "-> " + list3.next.data);
        ListNode three = new ListNode(3);
        three.next = list3;  //new node to attach to the front

        System.out.println(three.data +"-> " + list3.data + " ->" + list3.next.data );
        list3 = three;  //repoint the list3 to the front new node
        System.out.println(list3.data +"-> " + list3.next.data + " ->" + list3.next.next.data + "-> " + list3.next.next.next );
        System.out.println(three.data  + list3.data + list3.next.data ); //this is different!

        System.out.println("List4/List5 - Insert node from List5 to List4...");
        ListNode list4 = new ListNode((10));
        list4.next = new ListNode(20);
        System.out.println("build list4: "+list4.data + "-> " + list4.next.data);
        ListNode list5 = new ListNode((30));
        list5.next = new ListNode(40);
        System.out.println("build list5: "+list5.data + "-> " + list5.next.data);

        //declare a temporary list pointer to avoid loss of nodes or orphans!!
        ListNode temp = list5.next;
        System.out.println("temp: " + temp.data +"->" + temp.next);
        //reassign pointers
        list5.next = list4.next;  // 30 points to 20
        list4.next = list5;        // 10 points to 30
        list5 = temp;               //list 5 is now points to 40
        System.out.println("list4: " + list4.data +"->" + list4.next.data + "->"+list4.next.next.data +"->"+ list4.next.next.next);
        System.out.println("list5: " + list5.data +"->" + list5.next);
        //Concatenate two lists
        list4.next.next.next = list5;
        System.out.println("list4: " + list4.data +"->" + list4.next.data + "->"+list4.next.next.data +"->"+ list4.next.next.next.data+"->"+list4.next.next.next.next);
//        while (list != null) { // lose the link to your LL!
//            System.out.println(list.data);
//            list = list.next;    // move to next node}
//        }
        //need to store a pointer to current, changing current will not damage the list
        System.out.println("Linked List Traversal...While Loop");
        ListNode current = list4;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;  // move to next node}
        }
        //using the LinkedIntList class
        LinkedIntList list6 = new LinkedIntList();
        for (int i = 0; i <=3; i++){
            list6.add(i*10);
        }
//        link6.add(10);
//        link6.add(20);
//        link6.add(30);
        System.out.println("Linked List Traversal...While Loop");
        System.out.println(list6);
    }
}
