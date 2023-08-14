public class MyBook extends Book {
    private int price;

    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }

    @Override
    void display() {
        System.out.println("Title: ".concat(this.title));
        System.out.println("Author: ".concat(this.author));
        System.out.println("Price: ".concat(String.valueOf(this.price)));
    }
}
