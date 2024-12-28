package ATD.FIFO;
public interface IFIFO<E> {

    public void add(E element);
    public E remove();
    public E peek();
    public boolean isEmpty();
    public void display();
}

    

