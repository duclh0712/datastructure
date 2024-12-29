    import ATD.ArrList;
    import ATD.FIFO.FIFO;

    public class SystemBook {
        public static final String out = null;
        private FIFO<BookOrder> queue;
        private ArrList<BookOrder> bookOrder;


        public SystemBook() {
            this.queue = new FIFO<>();
            this.bookOrder = new ArrList<>();
        }

        public BookOrder createOrder(String customerName, String shippingAddress) {
            BookOrder  orderr = new BookOrder(customerName, shippingAddress);
            this.queue.add(orderr);
            this.bookOrder.add(orderr);
            return orderr;
        }

        public void sort(ArrList<Orderritem> items) {
            
            for ( int i = 0; i < items.size(); i++) {
                for (int j = 0; j < items.size() -i- 1; j++) {
                    // compareToIgnoreCase so sánh theo giá trị bảng mã ascii/unicode. Nếu giá trị ký tự tại chuỗi(i) > giá trị ký tự tại chuỗi (j+1) -> thực hiện bbsort
                    if (items.get(j).getBook().getTitle().compareToIgnoreCase(items.get(j + 1).getBook().getTitle()) > 0) {
                        // gán giá trị của j vào biến tạm
                        Orderritem temp = items.get(j);
                        // ghi đè lại giá trị của j = j+1
                        items.set(j, items.get(j + 1));
                        // ghi đè lại giá trị của j+1 = giá trị của biến tạm
                        items.set(j + 1, temp);
                    }
                }
            }
        }

        
        

        public ArrList<BookOrder> binarySearch(String customerName) {
            ArrList<BookOrder> matchingOrders = new ArrList<>();
            int left = 0;
            int right = bookOrder.size() - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                BookOrder midOrder = bookOrder.get(mid);
                int comparison = midOrder.getCustomerName().compareToIgnoreCase(customerName);

                if (comparison == 0) {
                    // Nếu tìm thấy, thêm đơn hàng vào danh sách kết quả
                    matchingOrders.add(midOrder);
                    
                    // Tìm kiếm thêm về phía bên trái
                    int temp = mid - 1;
                    while (temp >= 0 && bookOrder.get(temp).getCustomerName().equalsIgnoreCase(customerName)) {
                        matchingOrders.add(bookOrder.get(temp));
                        temp--;
                    }

                    // Tìm kiếm thêm về phía bên phải
                    temp = mid + 1;
                    while (temp < bookOrder.size() && bookOrder.get(temp).getCustomerName().equalsIgnoreCase(customerName)) {
                        matchingOrders.add(bookOrder.get(temp));
                        temp++;
                    }
                    
                    break; // Ngừng tìm kiếm khi đã tìm thấy
                } else if (comparison < 0) {
                    left = mid + 1; // Tìm kiếm bên phải
                } else {
                    right = mid - 1; // Tìm kiếm bên trái
                }
            }

            return matchingOrders;
        }

        public void display() {
            queue.display();
        }
    }
