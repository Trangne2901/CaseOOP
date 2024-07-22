import java.util.Arrays;
import java.util.Comparator;

public class Library {
    private int size = 0;
    private Ebook[] ebooks = new Ebook[size];

    //Xem danh sach
    public void showEbook() {
        for (Ebook i : ebooks) {
            System.out.println(i);
        }
    }

    //    them sach
    public Ebook[] addNewEbook(Ebook newEbook) {
        ebooks = Arrays.copyOf(ebooks, ebooks.length + 1);
        ebooks[size] = newEbook;
        size++;
        return ebooks;
    }

    public Ebook[] updateEbook(String id, String title, String author, int year, String category, int size, String format) {
        for (int i = 0; i < ebooks.length; i++) {
            if (ebooks[i].getId().equalsIgnoreCase(id)) {
                ebooks[i].setTitle(title);
                ebooks[i].setAuthor(author);
                ebooks[i].setYear(year);
                ebooks[i].setCategory(category);
                ebooks[i].setFormat(format);
                ebooks[i].setSize(size);
            }
        }
        return ebooks;
    }

    // Xoas sp theo id
    public boolean deleteNewEbook(String idBook) {
        if (ebooks.length == 0) {
            return false;
        }
        int k = 0;
        Ebook[] newEbooks = new Ebook[ebooks.length - 1];
        for (int i = 0; i < ebooks.length; i++) {
            if (!ebooks[i].getId().equalsIgnoreCase(idBook)) {
                newEbooks[k] = ebooks[i];
                k++;
            }
        }
        ebooks = newEbooks;
        return true;
    }

    //tìm kiếm sách điện tử dựa trên mã sách
    

}