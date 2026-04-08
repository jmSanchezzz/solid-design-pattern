public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student("John Doe");

        Resource cleanCodeBook = new Book();
        Resource natureJournal = new Journal();
        Resource atomicHabitsAudio = new AudioBook();

        student.borrowResource(cleanCodeBook, "Clean Code by Robert C. Martin");
        student.borrowResource(natureJournal, "Nature Vol. 500");
        student.borrowResource(atomicHabitsAudio, "Atomic Habits");
    }
}
