


package ATD.FIFO;

import ATD.Node;

public class FIFO<T> implements IFIFO<T> {

    Node<T> head;
    int size;

    public FIFO() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        
        // Nếu queue rỗng
        if (this.head == null) {
            //gán giá trị mới cho head
            this.head = newNode;
        } else {
            Node<T> current = this.head;//gán giá trị hiện tại của head cho biến tạm
            while (current.next != null) {
                // Tìm node cuối cùng
                current = current.next;
            }
            // Thêm node mới vào cuối
            current.next = newNode;
        }
        size++;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack rỗng");
            return null;
        }
        return this.head.data;
    }

    @Override
    public T remove() {
        if (isEmpty()) {
            
            return null;
        }
        
        // Lưu giá trị head 
        T data = this.head.data;
        // Di chuyển head sang node kế tiếp
        this.head = this.head.next;
        // data = null;//Xóa phần tử
        this.size--;
        
        return data;
    }

    public boolean isEmpty() {
        // giá trị trả về là true nếu queue không có phần tử nào | false nếu queue đang có phần tử
        return this.size == 0;
    }

    public int size() {
        // Trả về số lương phàn tử đang có trong queue
        return this.size;
    }

    @Override
    public void display() {
        
        Node<T> current = this.head;
        
        while (current != null) {
            // Hiển thị các phần tử đang có trong queue
            System.out.println(current.data + " ");
            current = current.next;
        }
    }

    
}