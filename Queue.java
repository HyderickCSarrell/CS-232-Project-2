package cs232_project2;

public interface Queue<T> {
    public void add(T item);
    public boolean isEmpty();
    public T peek();
    public T remove();
    public int size();
}
