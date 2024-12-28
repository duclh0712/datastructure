import ATD.FIFO.FIFO;
import ATD.LIFO.LIFO;

public class Main {
    public static void main(String[] args) {

        // Demo stack
        // LIFO<String> stack =  new LIFO<>();
        // stack.push("Nguyen Van A");
        // stack.push("Nguyen Van B");
        // stack.push("Nguyen Van C");

        // stack.display();
        // System.out.println(stack.size());

        //----------------------------------------------------------------

        // Demo queue

        FIFO<String> queue = new FIFO<>();
        queue.add("Nguyen Van A");
        queue.add("Nguyen Van B");
        queue.add("Nguyen Van C");
        queue.display();
        System.out.println(queue.size());
        
        System.out.println(queue.remove());
        System.out.println("Sau khi remove");
        queue.display();
    }
    
}
