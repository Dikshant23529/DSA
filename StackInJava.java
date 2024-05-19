public class StackInJava {

    private ListNode top;

    private int length;

    private class ListNode {

        private int data;

        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

}
