public class SinglyLinkedlist {

    private NodeList head;

    private static class NodeList {
        private NodeList next;
        private int data;

        public NodeList(int data) {
            this.data = data;
        }

    }

    public void display() {
        NodeList current = head;

        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");

    }

    public int count() {
        int c = 0;
        NodeList current = head;

        while (current != null) {
            c++;
            current = current.next;
        }
        return c;
    }

    public void insertFirst(int value) {
        NodeList nodeList = new NodeList(value);

        nodeList.next = head;

        head = nodeList;
    }

    public void insertLast(int value) {

        NodeList newnode = new NodeList(value);

        if (head == null) {
            head = newnode;
            return;
        }
        NodeList current = head;
        while (null != current.next) {
            current = current.next;
        }

        current.next = newnode;
    }

    public void insertAnywhere(int position, int value) {
        NodeList newnode = new NodeList(value);

        if (position == 1) {
            newnode.next = head;
            head = newnode;
        } else {
            NodeList prev = head;
            int count = 1;
            while (count < position - 1) {
                prev = prev.next;
                count++;
            }
            NodeList current = prev.next;
            newnode.next = current;
            prev.next = newnode;
        }
    }

    public NodeList delete() {
       
        if (head == null) {
            return null;
        }

        NodeList temp = head;

        head = head.next;

        temp.next = null;
        return head;
    }

    public static void main(String[] args) {

        SinglyLinkedlist singlyLinkedlist = new SinglyLinkedlist();

        // singlyLinkedlist.head = new NodeList(10);

        // NodeList second = new NodeList(11);

        // NodeList third = new NodeList(11);

        // NodeList forth = new NodeList(11);

        // singlyLinkedlist.head.next = second;

        // second.next = third;

        // third.next = forth;

        singlyLinkedlist.insertFirst(1);
        singlyLinkedlist.insertFirst(11);
        singlyLinkedlist.insertFirst(21);
        singlyLinkedlist.insertFirst(13);
        singlyLinkedlist.insertFirst(15);
        singlyLinkedlist.insertFirst(14);
        singlyLinkedlist.insertLast(1000);
        singlyLinkedlist.insertLast(2000);
        singlyLinkedlist.insertAnywhere(2, 2020);
        singlyLinkedlist.delete();
        singlyLinkedlist.display();

        System.out.println();

        System.out.println("Length of the linked list is " + singlyLinkedlist.count());
    }

}
