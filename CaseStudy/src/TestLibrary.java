public class TestLibrary {
    public static void main(String[] args) {
        Library library = new Library();

        Ebook ebook1 = new Ebook(1,"PDF","S01"," Cuon sach thuw 1","Tac gia thu 1",2024,"kien thuc" );
        Ebook ebook2 = new Ebook(3,"PDF","S02"," Cuon sach thu 2","Tac gia thu 2",2024,"kien thuc" );

        library.addNewEbook(ebook1);
        library.addNewEbook(ebook2);
        System.out.println("Mang sau khi them la:");
        library.showEbook();

        System.out.println("Mang sau khi sua la: ");
        library.updateEbook("S01", "Cuon sach t1","Tac gia ",2025,"tieu thuyet",2,"Ppt");
        library.showEbook();

        System.out.println("Mang sau khi xoa;");
        library.deleteNewEbook("s01");
        library.showEbook();

    }

}
