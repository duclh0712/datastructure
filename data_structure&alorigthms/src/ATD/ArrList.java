package ATD;

import java.util.Arrays;

public class ArrList<T> {
    private int size;
    private int capacity;
    private T[] arr ;
    public ArrList() {
        this.size = 0;//khởi tạo kích thước mảng ban đầu bằng 0
        this.capacity = 10;// dung lượng mảng ban đầu banggf 10
        this.arr = (T[]) new Object[capacity];
    }

    public void add(T item) {
        if ( size == capacity) {
            //tăng dung lươngk khi size == capacity
            capacity *= 2;
            arr = Arrays.copyOf(arr, capacity);//gán lại giá trị của arr bằng mảng mới được copy từ mảng cũ và dung lương mới
        }
        
        arr[size] = item;//lưu phần tử vào cuối mảng
        this.size++;

    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Vị trí không tồn tại");
            return null;
        }

        // Trả về phần tử vị trí index trong mảng
        return arr[index];
    }

    public void set(int index, T element) {
        if (index < 0 || index >= size) {
            System.out.println("Vị trí không tồn tại");
        }
        arr[index] = element;//ghi đè lại phần tử tại ví trí index
    }

    public int size() {
        // Trả về kích thước hiện tại của mảng
        return this.size;
    }

    public void display() {
        for (int i = 0 ; i< size(); i++) {
            // Hiển thị tất cả phần tử đang có trong mảng
            System.out.println(arr[i]);
        }
    }

    
}
