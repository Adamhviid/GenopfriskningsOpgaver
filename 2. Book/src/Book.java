public class Book {

    private int ISBN;
    private String Title;
    private int Year;

    public Book(int ISBN, String Title, int Year) {
        this.ISBN = ISBN;
        this.Title = Title;
        this.Year = Year;
    }

    public String toString() {
        return ISBN + ", " + Title + ", " + Year;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public int getYear() {
        return Year;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }


}
