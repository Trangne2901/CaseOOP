public class Ebook extends Book {
    private int size;
    private String format;
    public Ebook (){}
    public Ebook(int size, String format){
        this.size = size;
        this.format = format;
    }
    public Ebook ( int size, String format, String id,  String title, String author, int year, String category){
        super( id, title, author,year,category);
        this.size = size;
        this.format = format;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Ebook{" +
                "size=" + size +
                ", format='" + format + '\'' +
                ", id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", category='" + category + '\'' +
                '}';
    }
}
