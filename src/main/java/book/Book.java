package book;

public class Book {

    private String author;

    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    String getAuthor() {
        return author;
    }

    String getTitle() {
        return title;
    }

    static Book of(String author, String title) {
        return new Book(author, title);
    }


}
