package mediatheque;

public class Dictionary extends Document{
    private Language language;
    private int tome;

    public Dictionary(Language language, int tome, String isbn, String title, String author, int yearOfPublication) {
        super(isbn, title, author, yearOfPublication);
        this.language = language;
        this.tome = tome;
    }

    @Override
    public String toString() {
        return "Dictionnary{" + "isbn=" + isbn + ", title=" + title + ", author=" + author + ", yearOfPublication=" + yearOfPublication + ", language=" + language + ", tome=" + tome + '}';
    }

    public Language getLanguage() {
        return language;
    }

    public int getTome() {
        return tome;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void setTome(int tome) {
        this.tome = tome;
    }
    
    
    
    
    
}
