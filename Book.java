public class Book implements Resource {
    @Override
    public void borrow(String title) {
        System.out.println("Borrowing physical book: " + title);
    }
}
