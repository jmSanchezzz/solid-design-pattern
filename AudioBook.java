public class AudioBook implements Resource {
    @Override
    public void borrow(String title) {
        System.out.println("Downloading audio book: " + title);
    }
}
