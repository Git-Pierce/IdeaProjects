package Ch16LinkedList;

public class LLIntList {
    private ListNode front;

    public LLIntList() {
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
    public int size(){
        int count = 0;
        ListNode current = front;
        while (current != null){
            current = current.next;
            count++;
        }
        return count;
    }

    public void removeAt(int value) {

        if (front != null) {
            ListNode current = front;
            ListNode foundAt = null;
            while (current.next != null) {
                if (current.next.data == value) {
                    foundAt = current;
                }
                current = current.next;
            }
            if (foundAt != null) {
                foundAt.next = foundAt.next.next; //skip over what was found

            } else if (front.data == value) { //if foundAt is null then check front
                front = front.next;


            }
        }
    }

    public boolean removeAt1(int value1) {
        boolean found = false;
        if (front != null) {
            ListNode current = front;
            ListNode foundAt = null;
            while (current.next != null) {
                if (current.next.data == value1) {
                    foundAt = current;
                }
                current = current.next;
            }
            if (foundAt != null) {
                foundAt.next = foundAt.next.next; //skip over what was found
                found = true;
            } else if (front.data == value1){ //if foundAt is null then check front
                front = front.next;
                found = true;
            } else {
                return found=false;
            }
        }
        return found;
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
