package mediatheque;

import java.time.LocalDate;

public class Magazine extends Document{
    private MagazinePeriodicity periodicity;
    private LocalDate dateEdition;

    public Magazine(MagazinePeriodicity periodicity, LocalDate dateEdition, String isbn, String title, String author, int yearOfPublication) {
        super(isbn, title, author, yearOfPublication);
        this.periodicity = periodicity;
        this.dateEdition = dateEdition;
    }
    
    @Override
    public String toString() {
        return "Magazine{" + "isbn=" + isbn + ", title=" + title + ", author=" + author + ", yearOfPublication=" + yearOfPublication + ", periodicity=" + periodicity + ", dateEdition=" + dateEdition + '}';
    }

    public MagazinePeriodicity getPeriodicity() {
        return periodicity;
    }

    public LocalDate getDateEdition() {
        return dateEdition;
    }

    public void setPeriodicity(MagazinePeriodicity periodicity) {
        this.periodicity = periodicity;
    }

    public void setDateEdition(LocalDate dateEdition) {
        this.dateEdition = dateEdition;
    }
    
    
    
}
