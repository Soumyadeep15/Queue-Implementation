public class Queue {
    private Node first;
    private Node last;
    private int count=0;

    public void add(Object data) {
        Node newNode = new Node(data);
        if(isEmpty()) {
            first = newNode;
            last = first;
            count++;
            return;
        }
       last.next=newNode;
       last=last.next;
       count++;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public Object get() {
        if(isEmpty()) throw new IllegalStateException("Queue is empty");
        Object data = first.data;
        first = first.next;
        if(first == null) last = null;
        return data;
    }

    public Object peek() {
        if(isEmpty()) throw new IllegalStateException("Queue is Empty");
        return first.data;
    }

    public int size() {
        return count;
    }
}
