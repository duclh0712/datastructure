
import ATD.ArrList;
import ATD.FIFO.FIFO;
import ATD.LIFO.LIFO;

public class Main {
    public static void main(String[] args) {

        SystemBook s = new SystemBook();
        // Tạo sách
        Book book1 = new Book("Java Programming", "John Smith");
        Book book2 = new Book("Data Structures", "Jane Doe");
        Book book3 = new Book("Algorithms", "Bob Johnson");

        // Tạo order
        BookOrder orddr1 = s.createOrder("Nguyen Van A", "HCM");
        orddr1.addItem(book1, 11);
        orddr1.addItem(book3, 2);

        // Tạo order
        BookOrder orddr2 = s.createOrder("Nguyen Van B", "HCM");
        orddr2.addItem(book3, 1);
        // Danh sách các order trước khi sort
        System.out.println("Before sort");
        s.display();

        // Đảm bảo danh sách order phải được sắp xếp trước khi search
        s.sort(orddr1.getItems());
        s.sort(orddr2.getItems());
        // Khách hàng tìm kiếm đơn hàng bằng cách tìm kiếm theo tên khách hàng
        // đối số : <bookorder>.getCustomerName() || "String"
        // ArrList<BookOrder> order = s.binarySearch("Nguyen Van B");

        // for (int i = 0; i < order.size(); i++) {
        //     System.out.println(order.get(i));
        // }
        // Danh sách các order sau khi sort
        System.out.println("After sort");
        s.display();
    }

}
