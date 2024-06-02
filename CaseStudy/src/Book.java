public class Book {
    protected String id;
    protected String title;
    protected String author;
    protected int year;
    protected String category;

    public Book(){
    }
    public Book(String id, String title, String author, int year, String category){
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        this.category =  category;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ID_Book='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", category='" + category + '\'' +
                '}';
    }
}
