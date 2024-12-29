import ATD.ArrList;

public class BookOrder {
    private String customerName;
    private String shippingAddress;
    private ArrList<Orderritem> items;

    public BookOrder(String customerName, String shippingAddress) {
        this.customerName = customerName;
        this.shippingAddress = shippingAddress;
        this.items = new ArrList<>();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public ArrList<Orderritem> getItems() {
        return items;
    }

    public void setItems(ArrList<Orderritem> items) {
        this.items = items;
    }

    public void addItem(Book book, int quantity) {
        items.add(new Orderritem(book, quantity));
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("BookOrder [customerName=").append(customerName)
          .append(", shippingAddress=").append(shippingAddress)
          .append(", items=[");

        for (int i = 0; i < items.size(); i++) {
            sb.append(items.get(i).toString());
            if (i < items.size() - 1) {
                sb.append(", "); // Thêm dấu phẩy giữa các mục
            }
        }
        sb.append("]]");

        return sb.toString();
    }

}