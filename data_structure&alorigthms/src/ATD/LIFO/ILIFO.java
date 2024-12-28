package ATD.LIFO;

public interface ILIFO<T> {
    public void push(T element);
    public T pop();
    public T peek();
    public boolean isEmpty();
    public int size();
    public void display();
}
