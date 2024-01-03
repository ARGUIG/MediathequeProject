package mediatheque;


public class Book extends Document{
    private int nbreOfPages;
    private BookCategory bookCategory;
    private int tome;

    public Book(int nbreOfPages, BookCategory bookCategory, int tome, String isbn, String title, String author, int yearOfPublication) {
        super(isbn, title, author, yearOfPublication);
        this.nbreOfPages = nbreOfPages;
        this.bookCategory = bookCategory;
        this.tome = tome;
    }
///ss
    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", title=" + title + ", author=" + author + ", yearOfPublication=" + yearOfPublication +", nbreOfPages=" + nbreOfPages + ", bookCategory=" + bookCategory + ", tome=" + tome + '}';
    }
    

    public int getNbreOfPages() {
        return nbreOfPages;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public int getTome() {
        return tome;
    }

    public void setNbreOfPages(int nbreOfPages) {
        this.nbreOfPages = nbreOfPages;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public void setTome(int tome) {
        this.tome = tome;
    }
}
