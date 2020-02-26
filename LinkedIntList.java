package Ch16LinkedList;

import java.util.List;
// Example Collection Class using add, remove, get, hasOdd, hasEven, hasOddEven etc.
public class LinkedIntList {
    // want to create LL class to add nodes
    private ListNode front;

    public LinkedIntList() {
        //test commit
        front = null;
    }

    // Adds the given value to the end of the list.
    public void add(int value) {
        if (front == null) {
            // /\ adding to an empty list
            front = new ListNode(value);
        } else {        // adding to the end of an existing list        ...

            ListNode current = front;  //stores the front of the linked list
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    public void add(int value, int index){
        if (index ==0){
            front = new ListNode(value, front); //node @ the front
        }
        else {
            ListNode current = nodeAt(index-1);
            current.next = new ListNode(value, current.next);
        }
    }

    private ListNode nodeAt(int index){
        ListNode current = front;
        for (int i=0; i < index; i++){
            current = current.next;
        }
        return current;
    }
    // Returns value in list at given index.// Precondition: 0 <= index < size()
    public int get(int index) {
        ListNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
    //2nd get using nodeAt() private method
    public int getValue(int index){
        return nodeAt(index).data;
    }

    public void remove(int index){
        if (index ==0){
            front = front.next;
        }
        else {
            ListNode current = nodeAt(index-1);
            current.next = current.next.next;
        }
    }
    public int size(){
        int count = 0;
        ListNode current = front;
        while (current != null){
            current = current.next;
            count++;
        }
        return count;
    }

    public int indexOf(int value){
        int index =0;
        ListNode current = front;
        while (current != null){
            if (current.data == value){
                return index;
            }
            index++;
            current = current.next;
        }
        return -1; //index not found
    }

    public boolean hasOddEven() {
        ListNode current = front;
        boolean even = false;
        boolean odd = false;
        while (current != null) {
            if (current.data % 2 == 0) {
                even = true;
            } else {
                odd = true;
            }
            if (even && odd) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public boolean hasOdd(){
        ListNode current = front;
        boolean odd = false;
        while (current != null){
            if (current.data % 2 ==0){
                return false;
            }
            else {
                return odd = true;
            }
        }
        return odd;
    }
    public boolean hasEven(){
        ListNode current = front;
        boolean even = false;
        while (current != null){
            if (current.data % 2 ==0){
                return even=true;
            }
            else {
                return even = false;
            }
        }
        return even;
    }


    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            String result = "[" + front.data;
            ListNode current = front.next;
            while (current != null) {
                result += "-> " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }



    }

}
