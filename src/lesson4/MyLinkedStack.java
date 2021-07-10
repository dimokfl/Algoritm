package lesson4;

public class MyLinkedStack<E> {

    private MyLinkedList<E> list = new MyLinkedList<>();

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(E item) {
        list.insertLast(item);
    }

    public E remove() {
        return list.removeLast();
    }

    public E peek() {
        return list.getLast();
    }

}
