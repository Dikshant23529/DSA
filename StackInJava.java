import java.util.EmptyStackException;

public class StackInJava {

    private ListNode top;

    private int length;

    private class ListNode {

        private int data;

        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }

    }

    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop() {

        if (length == 0) {
            throw new EmptyStackException();
        }

        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public StackInJava() {
        top = null;
        length = 0;
    }

    public boolean isEmpty() {
        if (length == 0) {
            return true;
        }

        return false;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return top.data;
    }

    public static void main(String[] args) {
        StackInJava stackInJava = new StackInJava();
        stackInJava.push(10);
        stackInJava.push(20);
        stackInJava.push(30);
        stackInJava.push(40);

        System.out.println(stackInJava.peek());

        stackInJava.pop();

        System.out.println(stackInJava.peek());

    }

}
