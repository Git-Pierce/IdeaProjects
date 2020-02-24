package Ch16LinkedList;

import java.util.List;

public class LinkedIntList {
    // want to create LL class to add nodes
    private ListNode front;
    public LinkedIntList(){
        front = null;
    }
    // Adds the given value to the end of the list.
    public void add(int value) {
        if (front == null) {
    // /\ adding to an empty list
            front = new ListNode(value);    }
        else {        // adding to the end of an existing list        ...

            ListNode current = front;  //stores the front of the linked list
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
}}
// Returns value in list at given index.// Precondition: 0 <= index < size()
    public int get(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
    public String toString(ListNode list){
        ListNode current = list;
        String astring="";
        while (current != null) {
            astring = astring + current.data + "->";
            current = current.next;  // move to next node}
        }
        return astring;

    }
}
