package habr_2;

 class Node<T> {

    private T _data;
    private Node _next;

    public Node(T data) {
        _data = data;
        _next = null;
    }

    public void setData(T data) {
        _data = data;
    }

    public T getData() {
        return _data;
    }

    public void setNext(Node next) {
        _next = next;
    }

    public Node getNext() {
        return _next;
    }
}