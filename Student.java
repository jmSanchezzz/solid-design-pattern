public class Student {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void borrowResource(Resource resource, String title) {
        System.out.print(this.name + " is processing a request... ");
        resource.borrow(title);
    }
}
