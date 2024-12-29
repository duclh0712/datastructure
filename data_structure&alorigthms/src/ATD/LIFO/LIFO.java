package ATD.LIFO;

import ATD.Node;

public class LIFO<T> implements ILIFO<T> {
    private Node<T> head;
    private int size;

    public LIFO() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        // Trả vêf true nếu size bằng không | Trả về false nếu size > 0
        return this.size == 0;
    }

    @Override
    public T peek() {
        if (isEmpty())
            return null;
        return this.head.data;
    }

    @Override
    public T pop() {
        if (isEmpty())
            return null;

        T e = this.head.data;//Gán giá trị hiện tại của head cho biến tam
        this.head = this.head.next;//Di chuyển head sang node tiếp theo
        this.size--;

        return e;
    }

    @Override
    public void push(T element) {
        Node<T> node = new Node<>(element);

        if (this.head == null) {
            // Nếu stack rỗng
            this.head = node;
            this.size++;
        } else {
            // nếu stack không rỗng
            // Trỏ giá trị node tới head
            node.next = this.head;
            this.head = node;//gán giá trị head = node
            //tăng kích thước của stack
            this.size++;
        }
    }

    @Override
    public int size() {
        return this.size;//Trả về giá trị hiện tại của size
    }

    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("Không có phần tử nào");
            return;
        }
        // Hiển thị các phần tử đang có trong stack
        Node<T> current = this.head;//gán giá trị hiện tại của head cho biến tạm
        while (current != null) {
            System.out.println(current.data + "");
            current = current.next;//Dò lần lượt các phần tử có trong stack
        }
    }
}
