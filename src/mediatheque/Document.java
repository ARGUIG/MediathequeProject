package mediatheque;

public abstract class Document {
    protected String isbn,title,author;
    protected int yearOfPublication;

    public Document(String isbn, String title, String author, int yearOfPublication) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Document{" + "isbn=" + isbn + ", title=" + title + ", author=" + author + ", yearOfPublication=" + yearOfPublication + '}';
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    
    
    
}
