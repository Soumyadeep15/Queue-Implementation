public class Queue {
    Node first;
    Node last;
    private int count = 0;

    public boolean isEmpty() {
        return first == null;
    }

    public void add(Object data) {
        if(isEmpty()) {
            first = new Node(data , null);
            last = first;
            count++;
            return;
        }

        last.next = new Node(data,null);
        last = last.next;
        count++;
    }

    public Object get() {
        if(isEmpty()) throw new IllegalStateException("Queue is empty");
        Object data = first.data;
        first = first.next;
        return data;
    }

    public Object peek() {
        if(isEmpty()) throw new IllegalStateException("Queue is empty");
        return first.data;
    }

    public int size() {
        return count;
    }
}
