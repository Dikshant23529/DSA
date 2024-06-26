public class CircularSinglyLinkedList {

    private ListNode last;

    private int length;

    private class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public CircularSinglyLinkedList() {
        last = null;
        length = 0;
    }

    public boolean isEmpty() {
        if (length == 0) {
            return true;
        }

        return false;
    }

    public int length() {
        return length;
    }

    public void createCircualLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode forth = new ListNode(4);

        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = first;

        last = forth;

        length = 4;
    }

    /*
     * public void printList() {
     * ListNode temp = last;
     * while (temp != null) {
     * System.out.print(temp.data + "-->");
     * temp = temp.next;
     * if (temp.data == 4) {
     * System.out.println();
     * System.out.println("breaked");
     * break;
     * }
     * }
     * }
     */

    public void printList() {
        if (last == null) {
            return;
        }

        ListNode first = last.next;

        while (first != last) {
            System.out.print(first.data + "-->");
            first = first.next;
        }

        System.out.print(first.data + "");
        System.out.println();
    }

    public void insertFirst(int value) {
        ListNode temp = new ListNode(value);
        if (last == null) {
            last = temp;
        } 
        else 
        {
            temp.next = last.next;
        }

        last.next = temp;
        length++;
    }

    public void insertLast(int value){
        ListNode temp = new ListNode(value);
        if (last == null) {
            last = temp;
            last.next = last;
        }
        else
        {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    public ListNode removelast() {

        if (isEmpty()) {
            throw new IllegalArgumentException("Give the coorect argument");
        }

        ListNode temp = last.next;

        if (last.next == last) {
            last = null;
        }

        else {
            last.next = temp.next;
        }

        temp.next = null;
        length--;
        return temp;

    }
    public static void main(String[] args) {
        
        CircularSinglyLinkedList circularSinglyLinkedList = new CircularSinglyLinkedList();
        
        circularSinglyLinkedList.createCircualLinkedList();
        
        circularSinglyLinkedList.insertFirst(10);

        circularSinglyLinkedList.insertLast(20);

        circularSinglyLinkedList.removelast();

        circularSinglyLinkedList.printList();

        System.out.println(circularSinglyLinkedList.length());
    }

}
