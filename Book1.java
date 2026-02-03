public class Book1 {

    private String title;
    private boolean isAvailable = true;

    public Book1(String title) {
        this.title = title;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed.");
        } else {
            System.out.println("Book already borrowed.");
        }
    }

    public void returnBook() {
        isAvailable = true;
        System.out.println("Book returned.");
    }

    public static void main(String[] args) {
        Book1 b = new Book1("Java");
        b.borrowBook();
        b.borrowBook();
        b.returnBook();
    }
}
